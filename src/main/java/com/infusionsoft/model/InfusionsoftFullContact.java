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
import com.infusionsoft.model.InfusionsoftAddress;
import com.infusionsoft.model.InfusionsoftCompany;
import com.infusionsoft.model.InfusionsoftCustomFieldValue;
import com.infusionsoft.model.InfusionsoftEmailAddress;
import com.infusionsoft.model.InfusionsoftFaxNumber;
import com.infusionsoft.model.InfusionsoftPhoneNumber;
import com.infusionsoft.model.InfusionsoftRelationship;
import com.infusionsoft.model.InfusionsoftSocialAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * InfusionsoftFullContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T21:05:58.976Z")
public class InfusionsoftFullContact {
  @SerializedName("addresses")
  private List<InfusionsoftAddress> addresses = null;

  @SerializedName("anniversary")
  private OffsetDateTime anniversary = null;

  @SerializedName("birthday")
  private OffsetDateTime birthday = null;

  @SerializedName("company")
  private InfusionsoftCompany company = null;

  @SerializedName("contact_type")
  private String contactType = null;

  @SerializedName("custom_fields")
  private List<InfusionsoftCustomFieldValue> customFields = null;

  @SerializedName("date_created")
  private OffsetDateTime dateCreated = null;

  @SerializedName("email_addresses")
  private List<InfusionsoftEmailAddress> emailAddresses = null;

  @SerializedName("family_name")
  private String familyName = null;

  @SerializedName("fax_numbers")
  private List<InfusionsoftFaxNumber> faxNumbers = null;

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("job_title")
  private String jobTitle = null;

  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("lead_source_id")
  private Long leadSourceId = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("opt_in_reason")
  private String optInReason = null;

  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("phone_numbers")
  private List<InfusionsoftPhoneNumber> phoneNumbers = null;

  @SerializedName("preferred_locale")
  private String preferredLocale = null;

  @SerializedName("preferred_name")
  private String preferredName = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("relationships")
  private List<InfusionsoftRelationship> relationships = null;

  @SerializedName("social_accounts")
  private List<InfusionsoftSocialAccount> socialAccounts = null;

  /**
   * Gets or Sets sourceType
   */
  @JsonAdapter(SourceTypeEnum.Adapter.class)
  public enum SourceTypeEnum {
    WEBFORM("WEBFORM"),
    
    LANDINGPAGE("LANDINGPAGE"),
    
    IMPORT("IMPORT"),
    
    MANUAL("MANUAL"),
    
    API("API"),
    
    OTHER("OTHER"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("source_type")
  private SourceTypeEnum sourceType = null;

  @SerializedName("spouse_name")
  private String spouseName = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("tag_ids")
  private List<Long> tagIds = null;

  @SerializedName("time_zone")
  private String timeZone = null;

  @SerializedName("website")
  private String website = null;

  public InfusionsoftFullContact addresses(List<InfusionsoftAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public InfusionsoftFullContact addAddressesItem(InfusionsoftAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<InfusionsoftAddress>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<InfusionsoftAddress> addresses) {
    this.addresses = addresses;
  }

  public InfusionsoftFullContact anniversary(OffsetDateTime anniversary) {
    this.anniversary = anniversary;
    return this;
  }

   /**
   * Get anniversary
   * @return anniversary
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAnniversary() {
    return anniversary;
  }

  public void setAnniversary(OffsetDateTime anniversary) {
    this.anniversary = anniversary;
  }

  public InfusionsoftFullContact birthday(OffsetDateTime birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Get birthday
   * @return birthday
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(OffsetDateTime birthday) {
    this.birthday = birthday;
  }

  public InfusionsoftFullContact company(InfusionsoftCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftCompany getCompany() {
    return company;
  }

  public void setCompany(InfusionsoftCompany company) {
    this.company = company;
  }

  public InfusionsoftFullContact contactType(String contactType) {
    this.contactType = contactType;
    return this;
  }

   /**
   * Get contactType
   * @return contactType
  **/
  @ApiModelProperty(value = "")
  public String getContactType() {
    return contactType;
  }

  public void setContactType(String contactType) {
    this.contactType = contactType;
  }

  public InfusionsoftFullContact customFields(List<InfusionsoftCustomFieldValue> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InfusionsoftFullContact addCustomFieldsItem(InfusionsoftCustomFieldValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<InfusionsoftCustomFieldValue>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftCustomFieldValue> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<InfusionsoftCustomFieldValue> customFields) {
    this.customFields = customFields;
  }

  public InfusionsoftFullContact dateCreated(OffsetDateTime dateCreated) {
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

  public InfusionsoftFullContact emailAddresses(List<InfusionsoftEmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public InfusionsoftFullContact addEmailAddressesItem(InfusionsoftEmailAddress emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<InfusionsoftEmailAddress>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftEmailAddress> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<InfusionsoftEmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public InfusionsoftFullContact familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public InfusionsoftFullContact faxNumbers(List<InfusionsoftFaxNumber> faxNumbers) {
    this.faxNumbers = faxNumbers;
    return this;
  }

  public InfusionsoftFullContact addFaxNumbersItem(InfusionsoftFaxNumber faxNumbersItem) {
    if (this.faxNumbers == null) {
      this.faxNumbers = new ArrayList<InfusionsoftFaxNumber>();
    }
    this.faxNumbers.add(faxNumbersItem);
    return this;
  }

   /**
   * Get faxNumbers
   * @return faxNumbers
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftFaxNumber> getFaxNumbers() {
    return faxNumbers;
  }

  public void setFaxNumbers(List<InfusionsoftFaxNumber> faxNumbers) {
    this.faxNumbers = faxNumbers;
  }

  public InfusionsoftFullContact givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public InfusionsoftFullContact jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public InfusionsoftFullContact lastUpdated(OffsetDateTime lastUpdated) {
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

  public InfusionsoftFullContact leadSourceId(Long leadSourceId) {
    this.leadSourceId = leadSourceId;
    return this;
  }

   /**
   * Get leadSourceId
   * @return leadSourceId
  **/
  @ApiModelProperty(value = "")
  public Long getLeadSourceId() {
    return leadSourceId;
  }

  public void setLeadSourceId(Long leadSourceId) {
    this.leadSourceId = leadSourceId;
  }

  public InfusionsoftFullContact middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public InfusionsoftFullContact notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public InfusionsoftFullContact optInReason(String optInReason) {
    this.optInReason = optInReason;
    return this;
  }

   /**
   * Get optInReason
   * @return optInReason
  **/
  @ApiModelProperty(value = "")
  public String getOptInReason() {
    return optInReason;
  }

  public void setOptInReason(String optInReason) {
    this.optInReason = optInReason;
  }

  public InfusionsoftFullContact ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public InfusionsoftFullContact phoneNumbers(List<InfusionsoftPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public InfusionsoftFullContact addPhoneNumbersItem(InfusionsoftPhoneNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<InfusionsoftPhoneNumber>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<InfusionsoftPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public InfusionsoftFullContact preferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
    return this;
  }

   /**
   * Get preferredLocale
   * @return preferredLocale
  **/
  @ApiModelProperty(example = "en_US", value = "")
  public String getPreferredLocale() {
    return preferredLocale;
  }

  public void setPreferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
  }

  public InfusionsoftFullContact preferredName(String preferredName) {
    this.preferredName = preferredName;
    return this;
  }

   /**
   * Get preferredName
   * @return preferredName
  **/
  @ApiModelProperty(value = "")
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  public InfusionsoftFullContact prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(value = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public InfusionsoftFullContact relationships(List<InfusionsoftRelationship> relationships) {
    this.relationships = relationships;
    return this;
  }

  public InfusionsoftFullContact addRelationshipsItem(InfusionsoftRelationship relationshipsItem) {
    if (this.relationships == null) {
      this.relationships = new ArrayList<InfusionsoftRelationship>();
    }
    this.relationships.add(relationshipsItem);
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftRelationship> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<InfusionsoftRelationship> relationships) {
    this.relationships = relationships;
  }

  public InfusionsoftFullContact socialAccounts(List<InfusionsoftSocialAccount> socialAccounts) {
    this.socialAccounts = socialAccounts;
    return this;
  }

  public InfusionsoftFullContact addSocialAccountsItem(InfusionsoftSocialAccount socialAccountsItem) {
    if (this.socialAccounts == null) {
      this.socialAccounts = new ArrayList<InfusionsoftSocialAccount>();
    }
    this.socialAccounts.add(socialAccountsItem);
    return this;
  }

   /**
   * Get socialAccounts
   * @return socialAccounts
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftSocialAccount> getSocialAccounts() {
    return socialAccounts;
  }

  public void setSocialAccounts(List<InfusionsoftSocialAccount> socialAccounts) {
    this.socialAccounts = socialAccounts;
  }

  public InfusionsoftFullContact sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(value = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public InfusionsoftFullContact spouseName(String spouseName) {
    this.spouseName = spouseName;
    return this;
  }

   /**
   * Get spouseName
   * @return spouseName
  **/
  @ApiModelProperty(value = "")
  public String getSpouseName() {
    return spouseName;
  }

  public void setSpouseName(String spouseName) {
    this.spouseName = spouseName;
  }

  public InfusionsoftFullContact suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  @ApiModelProperty(value = "")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public InfusionsoftFullContact tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public InfusionsoftFullContact addTagIdsItem(Long tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<Long>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @ApiModelProperty(value = "")
  public List<Long> getTagIds() {
    return tagIds;
  }

  public void setTagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
  }

  public InfusionsoftFullContact timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public InfusionsoftFullContact website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftFullContact fullContact = (InfusionsoftFullContact) o;
    return Objects.equals(this.addresses, fullContact.addresses) &&
        Objects.equals(this.anniversary, fullContact.anniversary) &&
        Objects.equals(this.birthday, fullContact.birthday) &&
        Objects.equals(this.company, fullContact.company) &&
        Objects.equals(this.contactType, fullContact.contactType) &&
        Objects.equals(this.customFields, fullContact.customFields) &&
        Objects.equals(this.dateCreated, fullContact.dateCreated) &&
        Objects.equals(this.emailAddresses, fullContact.emailAddresses) &&
        Objects.equals(this.familyName, fullContact.familyName) &&
        Objects.equals(this.faxNumbers, fullContact.faxNumbers) &&
        Objects.equals(this.givenName, fullContact.givenName) &&
        Objects.equals(this.jobTitle, fullContact.jobTitle) &&
        Objects.equals(this.lastUpdated, fullContact.lastUpdated) &&
        Objects.equals(this.leadSourceId, fullContact.leadSourceId) &&
        Objects.equals(this.middleName, fullContact.middleName) &&
        Objects.equals(this.notes, fullContact.notes) &&
        Objects.equals(this.optInReason, fullContact.optInReason) &&
        Objects.equals(this.ownerId, fullContact.ownerId) &&
        Objects.equals(this.phoneNumbers, fullContact.phoneNumbers) &&
        Objects.equals(this.preferredLocale, fullContact.preferredLocale) &&
        Objects.equals(this.preferredName, fullContact.preferredName) &&
        Objects.equals(this.prefix, fullContact.prefix) &&
        Objects.equals(this.relationships, fullContact.relationships) &&
        Objects.equals(this.socialAccounts, fullContact.socialAccounts) &&
        Objects.equals(this.sourceType, fullContact.sourceType) &&
        Objects.equals(this.spouseName, fullContact.spouseName) &&
        Objects.equals(this.suffix, fullContact.suffix) &&
        Objects.equals(this.tagIds, fullContact.tagIds) &&
        Objects.equals(this.timeZone, fullContact.timeZone) &&
        Objects.equals(this.website, fullContact.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, anniversary, birthday, company, contactType, customFields, dateCreated, emailAddresses, familyName, faxNumbers, givenName, jobTitle, lastUpdated, leadSourceId, middleName, notes, optInReason, ownerId, phoneNumbers, preferredLocale, preferredName, prefix, relationships, socialAccounts, sourceType, spouseName, suffix, tagIds, timeZone, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftFullContact {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    anniversary: ").append(toIndentedString(anniversary)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    faxNumbers: ").append(toIndentedString(faxNumbers)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    leadSourceId: ").append(toIndentedString(leadSourceId)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    optInReason: ").append(toIndentedString(optInReason)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    preferredLocale: ").append(toIndentedString(preferredLocale)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    socialAccounts: ").append(toIndentedString(socialAccounts)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    spouseName: ").append(toIndentedString(spouseName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

