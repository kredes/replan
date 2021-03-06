=begin
SUPERSEDE ReleasePlanner API to UI

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end
class ResourcesController < ApplicationController
  before_action :set_resource, only: [:delete_resource, :modify_resource,:add_skills_to_resource, :delete_skills_from_resource
  ]

  def add_new_resource_to_project
    @resource = @project.resources.build(resource_params)
    if @resource.save
      render json: @resource
    else
      render json: @resource.errors, status: :unprocessable_entity
    end
  end

  def delete_resource
    # Your code here
    @resource.destroy
    render json: {"message" => "Resource deleted"}
  end

  def get_project_resources
    # Your code here

    render json: @project.resources
  end

  def modify_resource
    if @resource.update(resource_params)
      render json: @resource
    else
      render json: @resource.errors, status: :unprocessable_entity
    end
  end
  
  def add_skills_to_resource
    params[:_json].each do |s|
        skill = @project.skills.find_by(id: s[:skill_id])
          if skill and not @resource.skills.exists?(id: s[:skill_id])
            @resource.skills << skill
          end
      end
    render json: @resource
  end

  def delete_skills_from_resource
    params[:skillId].split(',').each do |i|
        skill = @resource.skills.find_by(id: i)
          if skill
            @resource.skills.delete(skill)
          end
      end
    render json: @resource
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_resource
      @resource = @project.resources.find(params[:resourceId])
    end

    # Only allow a trusted parameter "white list" through.
    def resource_params
      params.require(:resource).permit(:name, :description, :availability)
    end
end
