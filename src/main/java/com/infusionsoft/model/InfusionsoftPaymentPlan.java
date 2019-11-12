/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.70.0.156820
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.infusionsoft.model.InfusionsoftPaymentGateway;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * InfusionsoftPaymentPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftPaymentPlan {
  @SerializedName("auto_charge")
  private Boolean autoCharge = null;

  @SerializedName("credit_card_id")
  private Long creditCardId = null;

  @SerializedName("days_between_payments")
  private Integer daysBetweenPayments = null;

  @SerializedName("initial_payment_amount")
  private Double initialPaymentAmount = null;

  @SerializedName("initial_payment_date")
  private LocalDate initialPaymentDate = null;

  @SerializedName("number_of_payments")
  private Integer numberOfPayments = null;

  @SerializedName("payment_gateway")
  private InfusionsoftPaymentGateway paymentGateway = null;

  @SerializedName("plan_start_date")
  private LocalDate planStartDate = null;

  public InfusionsoftPaymentPlan autoCharge(Boolean autoCharge) {
    this.autoCharge = autoCharge;
    return this;
  }

   /**
   * Get autoCharge
   * @return autoCharge
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoCharge() {
    return autoCharge;
  }

  public void setAutoCharge(Boolean autoCharge) {
    this.autoCharge = autoCharge;
  }

  public InfusionsoftPaymentPlan creditCardId(Long creditCardId) {
    this.creditCardId = creditCardId;
    return this;
  }

   /**
   * Get creditCardId
   * @return creditCardId
  **/
  @ApiModelProperty(value = "")
  public Long getCreditCardId() {
    return creditCardId;
  }

  public void setCreditCardId(Long creditCardId) {
    this.creditCardId = creditCardId;
  }

  public InfusionsoftPaymentPlan daysBetweenPayments(Integer daysBetweenPayments) {
    this.daysBetweenPayments = daysBetweenPayments;
    return this;
  }

   /**
   * Get daysBetweenPayments
   * @return daysBetweenPayments
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDaysBetweenPayments() {
    return daysBetweenPayments;
  }

  public void setDaysBetweenPayments(Integer daysBetweenPayments) {
    this.daysBetweenPayments = daysBetweenPayments;
  }

  public InfusionsoftPaymentPlan initialPaymentAmount(Double initialPaymentAmount) {
    this.initialPaymentAmount = initialPaymentAmount;
    return this;
  }

   /**
   * Get initialPaymentAmount
   * @return initialPaymentAmount
  **/
  @ApiModelProperty(value = "")
  public Double getInitialPaymentAmount() {
    return initialPaymentAmount;
  }

  public void setInitialPaymentAmount(Double initialPaymentAmount) {
    this.initialPaymentAmount = initialPaymentAmount;
  }

  public InfusionsoftPaymentPlan initialPaymentDate(LocalDate initialPaymentDate) {
    this.initialPaymentDate = initialPaymentDate;
    return this;
  }

   /**
   * Get initialPaymentDate
   * @return initialPaymentDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getInitialPaymentDate() {
    return initialPaymentDate;
  }

  public void setInitialPaymentDate(LocalDate initialPaymentDate) {
    this.initialPaymentDate = initialPaymentDate;
  }

  public InfusionsoftPaymentPlan numberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

   /**
   * Get numberOfPayments
   * @return numberOfPayments
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public InfusionsoftPaymentPlan paymentGateway(InfusionsoftPaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
    return this;
  }

   /**
   * Get paymentGateway
   * @return paymentGateway
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftPaymentGateway getPaymentGateway() {
    return paymentGateway;
  }

  public void setPaymentGateway(InfusionsoftPaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public InfusionsoftPaymentPlan planStartDate(LocalDate planStartDate) {
    this.planStartDate = planStartDate;
    return this;
  }

   /**
   * Get planStartDate
   * @return planStartDate
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getPlanStartDate() {
    return planStartDate;
  }

  public void setPlanStartDate(LocalDate planStartDate) {
    this.planStartDate = planStartDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftPaymentPlan paymentPlan = (InfusionsoftPaymentPlan) o;
    return Objects.equals(this.autoCharge, paymentPlan.autoCharge) &&
        Objects.equals(this.creditCardId, paymentPlan.creditCardId) &&
        Objects.equals(this.daysBetweenPayments, paymentPlan.daysBetweenPayments) &&
        Objects.equals(this.initialPaymentAmount, paymentPlan.initialPaymentAmount) &&
        Objects.equals(this.initialPaymentDate, paymentPlan.initialPaymentDate) &&
        Objects.equals(this.numberOfPayments, paymentPlan.numberOfPayments) &&
        Objects.equals(this.paymentGateway, paymentPlan.paymentGateway) &&
        Objects.equals(this.planStartDate, paymentPlan.planStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCharge, creditCardId, daysBetweenPayments, initialPaymentAmount, initialPaymentDate, numberOfPayments, paymentGateway, planStartDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftPaymentPlan {\n");
    
    sb.append("    autoCharge: ").append(toIndentedString(autoCharge)).append("\n");
    sb.append("    creditCardId: ").append(toIndentedString(creditCardId)).append("\n");
    sb.append("    daysBetweenPayments: ").append(toIndentedString(daysBetweenPayments)).append("\n");
    sb.append("    initialPaymentAmount: ").append(toIndentedString(initialPaymentAmount)).append("\n");
    sb.append("    initialPaymentDate: ").append(toIndentedString(initialPaymentDate)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    paymentGateway: ").append(toIndentedString(paymentGateway)).append("\n");
    sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
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
