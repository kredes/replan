package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.NextReleaseProblem;
import io.swagger.model.PlanningSolution;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-14T06:15:31.650Z")

@Api(value = "replan", description = "the replan API")
public interface ReplanApi {

    @ApiOperation(value = "Generates a Planning Solution for a given Next Release Problem", notes = "", response = PlanningSolution.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PlanningSolution.class),
        @ApiResponse(code = 400, message = "Bad Request", response = PlanningSolution.class),
        @ApiResponse(code = 422, message = "Unprocessable Entity", response = PlanningSolution.class) })
    @RequestMapping(value = "/replan",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<PlanningSolution> replan(@ApiParam(value = "" ,required=true ) @RequestBody NextReleaseProblem body);

}
