/*
   (C) Copyright 2015-2018 The SUPERSEDE Project Consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
     http://www.apache.org/licenses/LICENSE-2.0
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package eu.supersede.fe.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.supersede.fe.jpa.ProfilesJpa;
import eu.supersede.fe.model.Profile;

@RestController
@RequestMapping("/profile")
public class ProfileRest {

	@Autowired
	private ProfilesJpa profiles;
	
	//@Secured({"ROLE_ADMIN"})
	@RequestMapping("")
	public List<Profile> getProfiles() {
		return profiles.findAll();
	}
}
