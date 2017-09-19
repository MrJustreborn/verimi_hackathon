/**
 * Digital Identity and Payments Platform (verimi)
 * The Digital Identity and Payments Platform (verimi) provides identity,  payment and data services for identity owners and service providers.  The services follows the schema defined by [JSON API](http://jsonapi.org/).    ## Schema  A JSON object MUST be at the root of every JSON API response containing data.  This object defines a document’s \"top level\".  A document MUST contain at least one of the following top-level members:   * `data`: the document’s \"primary data\"   * `errors`: an array of error objects   * `meta`: a meta object that contains non-standard meta-information.   ##  Processing Errors  A server MAY choose to stop processing as soon as a problem is encountered,  or it MAY continue processing and encounter multiple problems.  For instance, a server might process multiple attributes and then return multiple validation problems in a single response.  When a server encounters multiple problems for a single request,  the most generally applicable HTTP error code SHOULD be used in the response.  For instance, 400 Bad Request might be appropriate for multiple 4xx errors or  500 Internal Server Error might be appropriate for multiple 5xx errors.  ## Error Objects  Error objects provide additional information about problems encountered while performing an operation.  Error objects MUST be returned as an array keyed by errors in the top level of a JSON API document.  An error object MUST have the following members:  * `id`: a unique identifier for this particular occurrence of the problem  * `timestamp`: timestamp of the error recorded by the service (GMT) (extension of JSON API)  * `code`: an application-specific error code, expressed as a string value,   that MUST NOT change from occurrence to occurrence of the problem  * `title`: a short, human-readable summary of the problem   that SHOULD NOT change from occurrence to occurrence of the problem,   except for purposes of localization.  * `detail`: a human-readable explanation specific to this occurrence of the problem.   Like title, this field’s value can be localized.       An error object MAY have the following members:  * `status`: the HTTP status code applicable to this problem, expressed as a string value.      * `links`: a links object containing the following members:    * `about`: a link that leads to further details about this particular occurrence of the problem.       * `source`: an object containing references to the source of the error, optionally including any of the following members:    * `pointer`: a JSON Pointer [RFC6901] to the associated entity in the request document [e.g. \"/data\" for a primary data object, or \"/data/attributes/title\" for a specific attribute].    * `parameter`: a string indicating which URI query parameter caused the error.  * `meta`: a meta object containing non-standard meta-information about the error. 
 *
 * OpenAPI spec version: 1.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SourceElement
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-19T10:30:08.535+02:00")
public class SourceElement   {
  @SerializedName("parameter")
  private String parameter = null;

  public SourceElement parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceElement sourceElement = (SourceElement) o;
    return Objects.equals(this.parameter, sourceElement.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceElement {\n");
    
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

