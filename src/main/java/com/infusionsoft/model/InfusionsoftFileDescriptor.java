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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * InfusionsoftFileDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T21:05:58.976Z")
public class InfusionsoftFileDescriptor {
  /**
   * Gets or Sets category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    ATTACHMENTS("Attachments"),
    
    CART("Cart"),
    
    DOCUMENTS("Documents"),
    
    HIDDEN("Hidden"),
    
    INVOICE("Invoice"),
    
    LOGO("Logo"),
    
    TICKETS("Tickets"),
    
    WEBFORM("WebForm"),
    
    FUNNEL("Funnel");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("contact_id")
  private Long contactId = null;

  @SerializedName("created_by")
  private Long createdBy = null;

  @SerializedName("date_created")
  private OffsetDateTime dateCreated = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  /**
   * Gets or Sets fileBoxType
   */
  @JsonAdapter(FileBoxTypeEnum.Adapter.class)
  public enum FileBoxTypeEnum {
    APPLICATION("Application"),
    
    IMAGE("Image"),
    
    FAX("Fax"),
    
    ATTACHMENT("Attachment"),
    
    TICKET("Ticket"),
    
    CONTACT("Contact"),
    
    DIGITALPRODUCT("DigitalProduct"),
    
    IMPORT("Import"),
    
    HIDDEN("Hidden"),
    
    WEBFORM("WebForm"),
    
    STYLEDCART("StyledCart"),
    
    RESAMPLEDIMAGE("ReSampledImage"),
    
    TEMPLATETHUMBNAIL("TemplateThumbnail"),
    
    FUNNEL("Funnel"),
    
    LOGOTHUMBNAIL("LogoThumbnail");

    private String value;

    FileBoxTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileBoxTypeEnum fromValue(String text) {
      for (FileBoxTypeEnum b : FileBoxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FileBoxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileBoxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileBoxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FileBoxTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("file_box_type")
  private FileBoxTypeEnum fileBoxType = null;

  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("public")
  private Boolean _public = null;

  @SerializedName("remote_file_key")
  private String remoteFileKey = null;

  public InfusionsoftFileDescriptor category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public InfusionsoftFileDescriptor contactId(Long contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(value = "")
  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public InfusionsoftFileDescriptor createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public InfusionsoftFileDescriptor dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public InfusionsoftFileDescriptor downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @ApiModelProperty(value = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public InfusionsoftFileDescriptor fileBoxType(FileBoxTypeEnum fileBoxType) {
    this.fileBoxType = fileBoxType;
    return this;
  }

   /**
   * Get fileBoxType
   * @return fileBoxType
  **/
  @ApiModelProperty(value = "")
  public FileBoxTypeEnum getFileBoxType() {
    return fileBoxType;
  }

  public void setFileBoxType(FileBoxTypeEnum fileBoxType) {
    this.fileBoxType = fileBoxType;
  }

  public InfusionsoftFileDescriptor fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public InfusionsoftFileDescriptor fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @ApiModelProperty(value = "")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public InfusionsoftFileDescriptor lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public InfusionsoftFileDescriptor _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public InfusionsoftFileDescriptor remoteFileKey(String remoteFileKey) {
    this.remoteFileKey = remoteFileKey;
    return this;
  }

   /**
   * Get remoteFileKey
   * @return remoteFileKey
  **/
  @ApiModelProperty(value = "")
  public String getRemoteFileKey() {
    return remoteFileKey;
  }

  public void setRemoteFileKey(String remoteFileKey) {
    this.remoteFileKey = remoteFileKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftFileDescriptor fileDescriptor = (InfusionsoftFileDescriptor) o;
    return Objects.equals(this.category, fileDescriptor.category) &&
        Objects.equals(this.contactId, fileDescriptor.contactId) &&
        Objects.equals(this.createdBy, fileDescriptor.createdBy) &&
        Objects.equals(this.dateCreated, fileDescriptor.dateCreated) &&
        Objects.equals(this.downloadUrl, fileDescriptor.downloadUrl) &&
        Objects.equals(this.fileBoxType, fileDescriptor.fileBoxType) &&
        Objects.equals(this.fileName, fileDescriptor.fileName) &&
        Objects.equals(this.fileSize, fileDescriptor.fileSize) &&
        Objects.equals(this.lastUpdated, fileDescriptor.lastUpdated) &&
        Objects.equals(this._public, fileDescriptor._public) &&
        Objects.equals(this.remoteFileKey, fileDescriptor.remoteFileKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, contactId, createdBy, dateCreated, downloadUrl, fileBoxType, fileName, fileSize, lastUpdated, _public, remoteFileKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftFileDescriptor {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    fileBoxType: ").append(toIndentedString(fileBoxType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    remoteFileKey: ").append(toIndentedString(remoteFileKey)).append("\n");
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

