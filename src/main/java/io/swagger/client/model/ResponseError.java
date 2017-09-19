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
import org.joda.time.DateTime;


/**
 * Error objects provide additional information about problems encountered while performing an operation.  Error objects MUST be returned as an array keyed by errors in the top level of a JSON API document. 
 */
@ApiModel(description = "Error objects provide additional information about problems encountered while performing an operation.  Error objects MUST be returned as an array keyed by errors in the top level of a JSON API document. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-19T10:30:08.535+02:00")
public class ResponseError   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("links")
  private Object links = null;

  @SerializedName("source")
  private Object source = null;

  @SerializedName("meta")
  private Object meta = null;

  public ResponseError id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for this particular occurrence of the problem
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "A unique identifier for this particular occurrence of the problem")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResponseError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * An application-specific error code, expressed as a string value,  that MUST NOT change from occurrence to occurrence of the problem 
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "An application-specific error code, expressed as a string value,  that MUST NOT change from occurrence to occurrence of the problem ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ResponseError timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of the error recorded by the service (UTC)
   * @return timestamp
  **/
  @ApiModelProperty(example = "2017-07-04T16:20:50.52Z", required = true, value = "Timestamp of the error recorded by the service (UTC)")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ResponseError title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem  that SHOULD NOT change from occurrence to occurrence of the problem,  except for purposes of localization. 
   * @return title
  **/
  @ApiModelProperty(example = "null", required = true, value = "A short, human-readable summary of the problem  that SHOULD NOT change from occurrence to occurrence of the problem,  except for purposes of localization. ")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResponseError detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.  Like title, this field’s value can be localized. 
   * @return detail
  **/
  @ApiModelProperty(example = "null", required = true, value = "A human-readable explanation specific to this occurrence of the problem.  Like title, this field’s value can be localized. ")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ResponseError status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code applicable to this problem, expressed as a string value.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The HTTP status code applicable to this problem, expressed as a string value.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ResponseError links(Object links) {
    this.links = links;
    return this;
  }

   /**
   * Where specified, a links member can be used to represent links.  The value of each links member MUST be an object (a “links object”). Each member of a links object is a “link”.  A link MUST be represented as either a string containing the link’s URL  or an object (“link object”) which can contain \"href\" (a string containing the link’s URL)  and \"meta\" (a meta object containing non-standard meta-information about the link). 
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "Where specified, a links member can be used to represent links.  The value of each links member MUST be an object (a “links object”). Each member of a links object is a “link”.  A link MUST be represented as either a string containing the link’s URL  or an object (“link object”) which can contain \"href\" (a string containing the link’s URL)  and \"meta\" (a meta object containing non-standard meta-information about the link). ")
  public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }

  public ResponseError source(Object source) {
    this.source = source;
    return this;
  }

   /**
   * An object containing references to the source of the error
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "An object containing references to the source of the error")
  public Object getSource() {
    return source;
  }

  public void setSource(Object source) {
    this.source = source;
  }

  public ResponseError meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * A meta object containing non-standard meta-information about the error.
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "A meta object containing non-standard meta-information about the error.")
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseError responseError = (ResponseError) o;
    return Objects.equals(this.id, responseError.id) &&
        Objects.equals(this.code, responseError.code) &&
        Objects.equals(this.timestamp, responseError.timestamp) &&
        Objects.equals(this.title, responseError.title) &&
        Objects.equals(this.detail, responseError.detail) &&
        Objects.equals(this.status, responseError.status) &&
        Objects.equals(this.links, responseError.links) &&
        Objects.equals(this.source, responseError.source) &&
        Objects.equals(this.meta, responseError.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, timestamp, title, detail, status, links, source, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseError {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
