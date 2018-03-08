/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: V1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.infusionsoft.model.InfusionsoftStackTraceElement;
import com.infusionsoft.model.InfusionsoftThrowable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-08T21:00:11.570Z")
public class InfusionsoftError {
  @SerializedName("cause")
  private InfusionsoftThrowable cause = null;

  @SerializedName("localizedMessage")
  private String localizedMessage = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("stackTrace")
  private List<InfusionsoftStackTraceElement> stackTrace = null;

  @SerializedName("suppressed")
  private List<InfusionsoftThrowable> suppressed = null;

  public InfusionsoftError cause(InfusionsoftThrowable cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftThrowable getCause() {
    return cause;
  }

  public void setCause(InfusionsoftThrowable cause) {
    this.cause = cause;
  }

  public InfusionsoftError localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

   /**
   * Get localizedMessage
   * @return localizedMessage
  **/
  @ApiModelProperty(value = "")
  public String getLocalizedMessage() {
    return localizedMessage;
  }

  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  public InfusionsoftError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InfusionsoftError stackTrace(List<InfusionsoftStackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public InfusionsoftError addStackTraceItem(InfusionsoftStackTraceElement stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<InfusionsoftStackTraceElement>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftStackTraceElement> getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(List<InfusionsoftStackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
  }

  public InfusionsoftError suppressed(List<InfusionsoftThrowable> suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  public InfusionsoftError addSuppressedItem(InfusionsoftThrowable suppressedItem) {
    if (this.suppressed == null) {
      this.suppressed = new ArrayList<InfusionsoftThrowable>();
    }
    this.suppressed.add(suppressedItem);
    return this;
  }

   /**
   * Get suppressed
   * @return suppressed
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftThrowable> getSuppressed() {
    return suppressed;
  }

  public void setSuppressed(List<InfusionsoftThrowable> suppressed) {
    this.suppressed = suppressed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftError error = (InfusionsoftError) o;
    return Objects.equals(this.cause, error.cause) &&
        Objects.equals(this.localizedMessage, error.localizedMessage) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.stackTrace, error.stackTrace) &&
        Objects.equals(this.suppressed, error.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, localizedMessage, message, stackTrace, suppressed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftError {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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

