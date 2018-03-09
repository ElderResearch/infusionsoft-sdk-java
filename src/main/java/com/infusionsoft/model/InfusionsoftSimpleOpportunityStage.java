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
import com.infusionsoft.model.InfusionsoftStageDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftSimpleOpportunityStage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T21:05:58.976Z")
public class InfusionsoftSimpleOpportunityStage {
  @SerializedName("details")
  private InfusionsoftStageDetails details = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("reasons")
  private List<String> reasons = null;

  public InfusionsoftSimpleOpportunityStage details(InfusionsoftStageDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftStageDetails getDetails() {
    return details;
  }

  public void setDetails(InfusionsoftStageDetails details) {
    this.details = details;
  }

  public InfusionsoftSimpleOpportunityStage id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InfusionsoftSimpleOpportunityStage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InfusionsoftSimpleOpportunityStage reasons(List<String> reasons) {
    this.reasons = reasons;
    return this;
  }

  public InfusionsoftSimpleOpportunityStage addReasonsItem(String reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<String>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * Get reasons
   * @return reasons
  **/
  @ApiModelProperty(value = "")
  public List<String> getReasons() {
    return reasons;
  }

  public void setReasons(List<String> reasons) {
    this.reasons = reasons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftSimpleOpportunityStage simpleOpportunityStage = (InfusionsoftSimpleOpportunityStage) o;
    return Objects.equals(this.details, simpleOpportunityStage.details) &&
        Objects.equals(this.id, simpleOpportunityStage.id) &&
        Objects.equals(this.name, simpleOpportunityStage.name) &&
        Objects.equals(this.reasons, simpleOpportunityStage.reasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, id, name, reasons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftSimpleOpportunityStage {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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

