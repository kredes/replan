package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.NextReleaseProblem;
import io.swagger.model.PlanningSolution;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import wrapper.EntitiesEvaluator;
import wrapper.SolverNRP;
import wrapper.parser.Transform2NRPEntities;
import wrapper.parser.Transform2SwaggerModel;

import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-14T06:15:31.650Z")

@Controller
public class ReplanApiController implements ReplanApi {

    public ResponseEntity<PlanningSolution> replan(@ApiParam(value = "" ,required=true ) @RequestBody NextReleaseProblem body) {
        SolverNRP solverNRP = new SolverNRP();
        Transform2NRPEntities t = new Transform2NRPEntities();
        Transform2SwaggerModel t2 = new Transform2SwaggerModel();

        PlanningSolution p = t2.transformPlanningSolution2Swagger( solverNRP.executeNRP(body.getNbWeeks(),
                                                                    body.getHoursPerWeek(),
                                                                    t.FeatureList2Entities(body.getFeatures()),
                                                                    t.ListResource2Employee(body.getResources()),
                                                                    body.getActual_time()));


        return new ResponseEntity<PlanningSolution>(p,HttpStatus.OK);
    }

}
