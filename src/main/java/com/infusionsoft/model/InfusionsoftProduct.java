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
import com.infusionsoft.model.InfusionsoftProductOption;
import com.infusionsoft.model.InfusionsoftSubscriptionPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-08T21:00:11.570Z")
public class InfusionsoftProduct {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("product_desc")
  private String productDesc = null;

  @SerializedName("product_name")
  private String productName = null;

  @SerializedName("product_options")
  private List<InfusionsoftProductOption> productOptions = null;

  @SerializedName("product_price")
  private Double productPrice = null;

  @SerializedName("product_short_desc")
  private String productShortDesc = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("sub_category_id")
  private Long subCategoryId = null;

  @SerializedName("subscription_only")
  private Boolean subscriptionOnly = null;

  @SerializedName("subscription_plans")
  private List<InfusionsoftSubscriptionPlan> subscriptionPlans = null;

  @SerializedName("url")
  private String url = null;

  public InfusionsoftProduct id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InfusionsoftProduct productDesc(String productDesc) {
    this.productDesc = productDesc;
    return this;
  }

   /**
   * Get productDesc
   * @return productDesc
  **/
  @ApiModelProperty(value = "")
  public String getProductDesc() {
    return productDesc;
  }

  public void setProductDesc(String productDesc) {
    this.productDesc = productDesc;
  }

  public InfusionsoftProduct productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public InfusionsoftProduct productOptions(List<InfusionsoftProductOption> productOptions) {
    this.productOptions = productOptions;
    return this;
  }

  public InfusionsoftProduct addProductOptionsItem(InfusionsoftProductOption productOptionsItem) {
    if (this.productOptions == null) {
      this.productOptions = new ArrayList<InfusionsoftProductOption>();
    }
    this.productOptions.add(productOptionsItem);
    return this;
  }

   /**
   * Get productOptions
   * @return productOptions
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftProductOption> getProductOptions() {
    return productOptions;
  }

  public void setProductOptions(List<InfusionsoftProductOption> productOptions) {
    this.productOptions = productOptions;
  }

  public InfusionsoftProduct productPrice(Double productPrice) {
    this.productPrice = productPrice;
    return this;
  }

   /**
   * Get productPrice
   * @return productPrice
  **/
  @ApiModelProperty(value = "")
  public Double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }

  public InfusionsoftProduct productShortDesc(String productShortDesc) {
    this.productShortDesc = productShortDesc;
    return this;
  }

   /**
   * Get productShortDesc
   * @return productShortDesc
  **/
  @ApiModelProperty(value = "")
  public String getProductShortDesc() {
    return productShortDesc;
  }

  public void setProductShortDesc(String productShortDesc) {
    this.productShortDesc = productShortDesc;
  }

  public InfusionsoftProduct sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public InfusionsoftProduct status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InfusionsoftProduct subCategoryId(Long subCategoryId) {
    this.subCategoryId = subCategoryId;
    return this;
  }

   /**
   * Get subCategoryId
   * @return subCategoryId
  **/
  @ApiModelProperty(value = "")
  public Long getSubCategoryId() {
    return subCategoryId;
  }

  public void setSubCategoryId(Long subCategoryId) {
    this.subCategoryId = subCategoryId;
  }

  public InfusionsoftProduct subscriptionOnly(Boolean subscriptionOnly) {
    this.subscriptionOnly = subscriptionOnly;
    return this;
  }

   /**
   * Get subscriptionOnly
   * @return subscriptionOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionOnly() {
    return subscriptionOnly;
  }

  public void setSubscriptionOnly(Boolean subscriptionOnly) {
    this.subscriptionOnly = subscriptionOnly;
  }

  public InfusionsoftProduct subscriptionPlans(List<InfusionsoftSubscriptionPlan> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
    return this;
  }

  public InfusionsoftProduct addSubscriptionPlansItem(InfusionsoftSubscriptionPlan subscriptionPlansItem) {
    if (this.subscriptionPlans == null) {
      this.subscriptionPlans = new ArrayList<InfusionsoftSubscriptionPlan>();
    }
    this.subscriptionPlans.add(subscriptionPlansItem);
    return this;
  }

   /**
   * Get subscriptionPlans
   * @return subscriptionPlans
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftSubscriptionPlan> getSubscriptionPlans() {
    return subscriptionPlans;
  }

  public void setSubscriptionPlans(List<InfusionsoftSubscriptionPlan> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
  }

  public InfusionsoftProduct url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftProduct product = (InfusionsoftProduct) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.productDesc, product.productDesc) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.productOptions, product.productOptions) &&
        Objects.equals(this.productPrice, product.productPrice) &&
        Objects.equals(this.productShortDesc, product.productShortDesc) &&
        Objects.equals(this.sku, product.sku) &&
        Objects.equals(this.status, product.status) &&
        Objects.equals(this.subCategoryId, product.subCategoryId) &&
        Objects.equals(this.subscriptionOnly, product.subscriptionOnly) &&
        Objects.equals(this.subscriptionPlans, product.subscriptionPlans) &&
        Objects.equals(this.url, product.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productDesc, productName, productOptions, productPrice, productShortDesc, sku, status, subCategoryId, subscriptionOnly, subscriptionPlans, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftProduct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productDesc: ").append(toIndentedString(productDesc)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productOptions: ").append(toIndentedString(productOptions)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productShortDesc: ").append(toIndentedString(productShortDesc)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subCategoryId: ").append(toIndentedString(subCategoryId)).append("\n");
    sb.append("    subscriptionOnly: ").append(toIndentedString(subscriptionOnly)).append("\n");
    sb.append("    subscriptionPlans: ").append(toIndentedString(subscriptionPlans)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
