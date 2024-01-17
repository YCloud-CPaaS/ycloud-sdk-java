/*
 * YCloud API
 * The [YCloud](https://ycloud.com) API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer). Our API is designed to have predictable, resource-oriented URLs, return [JSON](https://www.json.org) responses, and use standard HTTP response codes and verbs.
 *
 * The version of the OpenAPI document: v2
 * Contact: service@ycloud.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ycloud.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ycloud.client.model.MetaBusinessAccountVerificationStatus;
import com.ycloud.client.model.WhatsappBusinessAccountBanState;
import com.ycloud.client.model.WhatsappBusinessAccountRestrictionInfo;
import com.ycloud.client.model.WhatsappBusinessAccountReviewStatus;
import com.ycloud.client.model.WhatsappBusinessAccountUpdateEventEnum;
import com.ycloud.client.model.WhatsappReviewDecision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ycloud.client.JSON;

/**
 * Represents a specific [WhatsApp Business Account (WABA)](https://www.facebook.com/business/help/1499554293524119).
 */
@ApiModel(description = "Represents a specific [WhatsApp Business Account (WABA)](https://www.facebook.com/business/help/1499554293524119).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappBusinessAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  /**
   * WhatApp Business Account ID.
  **/
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  /**
   * User-friendly name to differentiate WhatsApp Business Accounts.
  **/
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  /**
   * The currency in which the payment transactions for the WhatsApp Business Account will be processed.
  **/
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_MESSAGE_TEMPLATE_NAMESPACE = "messageTemplateNamespace";
  /**
   * Namespace string for the message templates that belong to the WhatsApp Business Account.
  **/
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEMPLATE_NAMESPACE)
  private String messageTemplateNamespace;

  public static final String SERIALIZED_NAME_ACCOUNT_REVIEW_STATUS = "accountReviewStatus";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_ACCOUNT_REVIEW_STATUS)
  private WhatsappBusinessAccountReviewStatus accountReviewStatus;

  public static final String SERIALIZED_NAME_BUSINESS_VERIFICATION_STATUS = "businessVerificationStatus";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_BUSINESS_VERIFICATION_STATUS)
  private MetaBusinessAccountVerificationStatus businessVerificationStatus;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  /**
   * Country of the WhatsApp Business Account&#39;s owning Meta Business account.
  **/
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_OWNERSHIP_TYPE = "ownershipType";
  /**
   * Ownership type of the WhatsApp Business Account.
  **/
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_TYPE)
  private String ownershipType;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_ATTACHED = "paymentMethodAttached";
  /**
   * Whether we have attached a payment method to the WhatsApp Business Account.
  **/
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_ATTACHED)
  private Boolean paymentMethodAttached;

  public static final String SERIALIZED_NAME_PRIMARY_FUNDING_ID = "primaryFundingId";
  /**
   * Primary funding ID for the WhatsApp Business Account paid service.
  **/
  @SerializedName(SERIALIZED_NAME_PRIMARY_FUNDING_ID)
  private String primaryFundingId;

  public static final String SERIALIZED_NAME_PURCHASE_ORDER_NUMBER = "purchaseOrderNumber";
  /**
   * The purchase order number supplied by the business for payment management purposes.
  **/
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER_NUMBER)
  private String purchaseOrderNumber;

  public static final String SERIALIZED_NAME_TIMEZONE_ID = "timezoneId";
  /**
   * The timezone ID of the WhatsApp Business Account. See [Timezone IDs](https://developers.facebook.com/docs/marketing-api/reference/ad-account/timezone-ids).
  **/
  @SerializedName(SERIALIZED_NAME_TIMEZONE_ID)
  private String timezoneId;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_DECISION)
  private WhatsappReviewDecision decision;

  public static final String SERIALIZED_NAME_UPDATE_EVENT = "updateEvent";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_UPDATE_EVENT)
  private WhatsappBusinessAccountUpdateEventEnum updateEvent;

  public static final String SERIALIZED_NAME_BAN_STATE = "banState";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_BAN_STATE)
  private WhatsappBusinessAccountBanState banState;

  public static final String SERIALIZED_NAME_BAN_DATE = "banDate";
  /**
   * The date when the WABA is banned.
  **/
  @SerializedName(SERIALIZED_NAME_BAN_DATE)
  private String banDate;

  public static final String SERIALIZED_NAME_VIOLATION_TYPE = "violationType";
  /**
   * Used to report violations imposed on the WABA. See also [WhatsApp Business Platform Policy Violations](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement/violations).
  **/
  @SerializedName(SERIALIZED_NAME_VIOLATION_TYPE)
  private String violationType;

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  /**
   * Used to report restrictions imposed on the WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement).
  **/
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  private List<WhatsappBusinessAccountRestrictionInfo> restrictions = null;

  public WhatsappBusinessAccount() { 
  }

  public WhatsappBusinessAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * WhatApp Business Account ID.
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  /**
   * WhatApp Business Account ID.
   **/
  @ApiModelProperty(value = "WhatApp Business Account ID.")
  public void setId(String id) {
    this.id = id;
  }


  public WhatsappBusinessAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * User-friendly name to differentiate WhatsApp Business Accounts.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  /**
   * User-friendly name to differentiate WhatsApp Business Accounts.
   **/
  @ApiModelProperty(value = "User-friendly name to differentiate WhatsApp Business Accounts.")
  public void setName(String name) {
    this.name = name;
  }


  public WhatsappBusinessAccount currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency in which the payment transactions for the WhatsApp Business Account will be processed.
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  /**
   * The currency in which the payment transactions for the WhatsApp Business Account will be processed.
   **/
  @ApiModelProperty(value = "The currency in which the payment transactions for the WhatsApp Business Account will be processed.")
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public WhatsappBusinessAccount messageTemplateNamespace(String messageTemplateNamespace) {
    
    this.messageTemplateNamespace = messageTemplateNamespace;
    return this;
  }

   /**
   * Namespace string for the message templates that belong to the WhatsApp Business Account.
   * @return messageTemplateNamespace
  **/
  @javax.annotation.Nullable

  public String getMessageTemplateNamespace() {
    return messageTemplateNamespace;
  }


  /**
   * Namespace string for the message templates that belong to the WhatsApp Business Account.
   **/
  @ApiModelProperty(value = "Namespace string for the message templates that belong to the WhatsApp Business Account.")
  public void setMessageTemplateNamespace(String messageTemplateNamespace) {
    this.messageTemplateNamespace = messageTemplateNamespace;
  }


  public WhatsappBusinessAccount accountReviewStatus(WhatsappBusinessAccountReviewStatus accountReviewStatus) {
    
    this.accountReviewStatus = accountReviewStatus;
    return this;
  }

   /**
   * Get accountReviewStatus
   * @return accountReviewStatus
  **/
  @javax.annotation.Nullable

  public WhatsappBusinessAccountReviewStatus getAccountReviewStatus() {
    return accountReviewStatus;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setAccountReviewStatus(WhatsappBusinessAccountReviewStatus accountReviewStatus) {
    this.accountReviewStatus = accountReviewStatus;
  }


  public WhatsappBusinessAccount businessVerificationStatus(MetaBusinessAccountVerificationStatus businessVerificationStatus) {
    
    this.businessVerificationStatus = businessVerificationStatus;
    return this;
  }

   /**
   * Get businessVerificationStatus
   * @return businessVerificationStatus
  **/
  @javax.annotation.Nullable

  public MetaBusinessAccountVerificationStatus getBusinessVerificationStatus() {
    return businessVerificationStatus;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setBusinessVerificationStatus(MetaBusinessAccountVerificationStatus businessVerificationStatus) {
    this.businessVerificationStatus = businessVerificationStatus;
  }


  public WhatsappBusinessAccount country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of the WhatsApp Business Account&#39;s owning Meta Business account.
   * @return country
  **/
  @javax.annotation.Nullable

  public String getCountry() {
    return country;
  }


  /**
   * Country of the WhatsApp Business Account&#39;s owning Meta Business account.
   **/
  @ApiModelProperty(value = "Country of the WhatsApp Business Account's owning Meta Business account.")
  public void setCountry(String country) {
    this.country = country;
  }


  public WhatsappBusinessAccount ownershipType(String ownershipType) {
    
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * Ownership type of the WhatsApp Business Account.
   * @return ownershipType
  **/
  @javax.annotation.Nullable

  public String getOwnershipType() {
    return ownershipType;
  }


  /**
   * Ownership type of the WhatsApp Business Account.
   **/
  @ApiModelProperty(value = "Ownership type of the WhatsApp Business Account.")
  public void setOwnershipType(String ownershipType) {
    this.ownershipType = ownershipType;
  }


  public WhatsappBusinessAccount paymentMethodAttached(Boolean paymentMethodAttached) {
    
    this.paymentMethodAttached = paymentMethodAttached;
    return this;
  }

   /**
   * Whether we have attached a payment method to the WhatsApp Business Account.
   * @return paymentMethodAttached
  **/
  @javax.annotation.Nullable

  public Boolean getPaymentMethodAttached() {
    return paymentMethodAttached;
  }


  /**
   * Whether we have attached a payment method to the WhatsApp Business Account.
   **/
  @ApiModelProperty(value = "Whether we have attached a payment method to the WhatsApp Business Account.")
  public void setPaymentMethodAttached(Boolean paymentMethodAttached) {
    this.paymentMethodAttached = paymentMethodAttached;
  }


  public WhatsappBusinessAccount primaryFundingId(String primaryFundingId) {
    
    this.primaryFundingId = primaryFundingId;
    return this;
  }

   /**
   * Primary funding ID for the WhatsApp Business Account paid service.
   * @return primaryFundingId
  **/
  @javax.annotation.Nullable

  public String getPrimaryFundingId() {
    return primaryFundingId;
  }


  /**
   * Primary funding ID for the WhatsApp Business Account paid service.
   **/
  @ApiModelProperty(value = "Primary funding ID for the WhatsApp Business Account paid service.")
  public void setPrimaryFundingId(String primaryFundingId) {
    this.primaryFundingId = primaryFundingId;
  }


  public WhatsappBusinessAccount purchaseOrderNumber(String purchaseOrderNumber) {
    
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The purchase order number supplied by the business for payment management purposes.
   * @return purchaseOrderNumber
  **/
  @javax.annotation.Nullable

  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }


  /**
   * The purchase order number supplied by the business for payment management purposes.
   **/
  @ApiModelProperty(value = "The purchase order number supplied by the business for payment management purposes.")
  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }


  public WhatsappBusinessAccount timezoneId(String timezoneId) {
    
    this.timezoneId = timezoneId;
    return this;
  }

   /**
   * The timezone ID of the WhatsApp Business Account. See [Timezone IDs](https://developers.facebook.com/docs/marketing-api/reference/ad-account/timezone-ids).
   * @return timezoneId
  **/
  @javax.annotation.Nullable

  public String getTimezoneId() {
    return timezoneId;
  }


  /**
   * The timezone ID of the WhatsApp Business Account. See [Timezone IDs](https://developers.facebook.com/docs/marketing-api/reference/ad-account/timezone-ids).
   **/
  @ApiModelProperty(example = "1", value = "The timezone ID of the WhatsApp Business Account. See [Timezone IDs](https://developers.facebook.com/docs/marketing-api/reference/ad-account/timezone-ids).")
  public void setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
  }


  public WhatsappBusinessAccount decision(WhatsappReviewDecision decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @javax.annotation.Nullable

  public WhatsappReviewDecision getDecision() {
    return decision;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setDecision(WhatsappReviewDecision decision) {
    this.decision = decision;
  }


  public WhatsappBusinessAccount updateEvent(WhatsappBusinessAccountUpdateEventEnum updateEvent) {
    
    this.updateEvent = updateEvent;
    return this;
  }

   /**
   * Get updateEvent
   * @return updateEvent
  **/
  @javax.annotation.Nullable

  public WhatsappBusinessAccountUpdateEventEnum getUpdateEvent() {
    return updateEvent;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setUpdateEvent(WhatsappBusinessAccountUpdateEventEnum updateEvent) {
    this.updateEvent = updateEvent;
  }


  public WhatsappBusinessAccount banState(WhatsappBusinessAccountBanState banState) {
    
    this.banState = banState;
    return this;
  }

   /**
   * Get banState
   * @return banState
  **/
  @javax.annotation.Nullable

  public WhatsappBusinessAccountBanState getBanState() {
    return banState;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setBanState(WhatsappBusinessAccountBanState banState) {
    this.banState = banState;
  }


  public WhatsappBusinessAccount banDate(String banDate) {
    
    this.banDate = banDate;
    return this;
  }

   /**
   * The date when the WABA is banned.
   * @return banDate
  **/
  @javax.annotation.Nullable

  public String getBanDate() {
    return banDate;
  }


  /**
   * The date when the WABA is banned.
   **/
  @ApiModelProperty(example = "December 9, 2022", value = "The date when the WABA is banned.")
  public void setBanDate(String banDate) {
    this.banDate = banDate;
  }


  public WhatsappBusinessAccount violationType(String violationType) {
    
    this.violationType = violationType;
    return this;
  }

   /**
   * Used to report violations imposed on the WABA. See also [WhatsApp Business Platform Policy Violations](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement/violations).
   * @return violationType
  **/
  @javax.annotation.Nullable

  public String getViolationType() {
    return violationType;
  }


  /**
   * Used to report violations imposed on the WABA. See also [WhatsApp Business Platform Policy Violations](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement/violations).
   **/
  @ApiModelProperty(example = "SCAM", value = "Used to report violations imposed on the WABA. See also [WhatsApp Business Platform Policy Violations](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement/violations).")
  public void setViolationType(String violationType) {
    this.violationType = violationType;
  }


  public WhatsappBusinessAccount restrictions(List<WhatsappBusinessAccountRestrictionInfo> restrictions) {
    
    this.restrictions = restrictions;
    return this;
  }

  public WhatsappBusinessAccount addRestrictionsItem(WhatsappBusinessAccountRestrictionInfo restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new ArrayList<>();
    }
    this.restrictions.add(restrictionsItem);
    return this;
  }

   /**
   * Used to report restrictions imposed on the WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement).
   * @return restrictions
  **/
  @javax.annotation.Nullable

  public List<WhatsappBusinessAccountRestrictionInfo> getRestrictions() {
    return restrictions;
  }


  /**
   * Used to report restrictions imposed on the WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement).
   **/
  @ApiModelProperty(value = "Used to report restrictions imposed on the WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement).")
  public void setRestrictions(List<WhatsappBusinessAccountRestrictionInfo> restrictions) {
    this.restrictions = restrictions;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public WhatsappBusinessAccount putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsappBusinessAccount whatsappBusinessAccount = (WhatsappBusinessAccount) o;
    return Objects.equals(this.id, whatsappBusinessAccount.id) &&
        Objects.equals(this.name, whatsappBusinessAccount.name) &&
        Objects.equals(this.currency, whatsappBusinessAccount.currency) &&
        Objects.equals(this.messageTemplateNamespace, whatsappBusinessAccount.messageTemplateNamespace) &&
        Objects.equals(this.accountReviewStatus, whatsappBusinessAccount.accountReviewStatus) &&
        Objects.equals(this.businessVerificationStatus, whatsappBusinessAccount.businessVerificationStatus) &&
        Objects.equals(this.country, whatsappBusinessAccount.country) &&
        Objects.equals(this.ownershipType, whatsappBusinessAccount.ownershipType) &&
        Objects.equals(this.paymentMethodAttached, whatsappBusinessAccount.paymentMethodAttached) &&
        Objects.equals(this.primaryFundingId, whatsappBusinessAccount.primaryFundingId) &&
        Objects.equals(this.purchaseOrderNumber, whatsappBusinessAccount.purchaseOrderNumber) &&
        Objects.equals(this.timezoneId, whatsappBusinessAccount.timezoneId) &&
        Objects.equals(this.decision, whatsappBusinessAccount.decision) &&
        Objects.equals(this.updateEvent, whatsappBusinessAccount.updateEvent) &&
        Objects.equals(this.banState, whatsappBusinessAccount.banState) &&
        Objects.equals(this.banDate, whatsappBusinessAccount.banDate) &&
        Objects.equals(this.violationType, whatsappBusinessAccount.violationType) &&
        Objects.equals(this.restrictions, whatsappBusinessAccount.restrictions)&&
        Objects.equals(this.additionalProperties, whatsappBusinessAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, currency, messageTemplateNamespace, accountReviewStatus, businessVerificationStatus, country, ownershipType, paymentMethodAttached, primaryFundingId, purchaseOrderNumber, timezoneId, decision, updateEvent, banState, banDate, violationType, restrictions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappBusinessAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    messageTemplateNamespace: ").append(toIndentedString(messageTemplateNamespace)).append("\n");
    sb.append("    accountReviewStatus: ").append(toIndentedString(accountReviewStatus)).append("\n");
    sb.append("    businessVerificationStatus: ").append(toIndentedString(businessVerificationStatus)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
    sb.append("    paymentMethodAttached: ").append(toIndentedString(paymentMethodAttached)).append("\n");
    sb.append("    primaryFundingId: ").append(toIndentedString(primaryFundingId)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    updateEvent: ").append(toIndentedString(updateEvent)).append("\n");
    sb.append("    banState: ").append(toIndentedString(banState)).append("\n");
    sb.append("    banDate: ").append(toIndentedString(banDate)).append("\n");
    sb.append("    violationType: ").append(toIndentedString(violationType)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("currency");
    openapiFields.add("messageTemplateNamespace");
    openapiFields.add("accountReviewStatus");
    openapiFields.add("businessVerificationStatus");
    openapiFields.add("country");
    openapiFields.add("ownershipType");
    openapiFields.add("paymentMethodAttached");
    openapiFields.add("primaryFundingId");
    openapiFields.add("purchaseOrderNumber");
    openapiFields.add("timezoneId");
    openapiFields.add("decision");
    openapiFields.add("updateEvent");
    openapiFields.add("banState");
    openapiFields.add("banDate");
    openapiFields.add("violationType");
    openapiFields.add("restrictions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappBusinessAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappBusinessAccount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappBusinessAccount is not found in the empty JSON string", WhatsappBusinessAccount.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("messageTemplateNamespace") != null && !jsonObj.get("messageTemplateNamespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageTemplateNamespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageTemplateNamespace").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("ownershipType") != null && !jsonObj.get("ownershipType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownershipType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownershipType").toString()));
      }
      if (jsonObj.get("primaryFundingId") != null && !jsonObj.get("primaryFundingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryFundingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryFundingId").toString()));
      }
      if (jsonObj.get("purchaseOrderNumber") != null && !jsonObj.get("purchaseOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchaseOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchaseOrderNumber").toString()));
      }
      if (jsonObj.get("timezoneId") != null && !jsonObj.get("timezoneId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezoneId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezoneId").toString()));
      }
      if (jsonObj.get("banDate") != null && !jsonObj.get("banDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banDate").toString()));
      }
      if (jsonObj.get("violationType") != null && !jsonObj.get("violationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violationType").toString()));
      }
      JsonArray jsonArrayrestrictions = jsonObj.getAsJsonArray("restrictions");
      if (jsonArrayrestrictions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("restrictions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `restrictions` to be an array in the JSON string but got `%s`", jsonObj.get("restrictions").toString()));
        }

        // validate the optional field `restrictions` (array)
        for (int i = 0; i < jsonArrayrestrictions.size(); i++) {
          WhatsappBusinessAccountRestrictionInfo.validateJsonObject(jsonArrayrestrictions.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappBusinessAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappBusinessAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappBusinessAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappBusinessAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappBusinessAccount>() {
           @Override
           public void write(JsonWriter out, WhatsappBusinessAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WhatsappBusinessAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappBusinessAccount instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WhatsappBusinessAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappBusinessAccount
  * @throws IOException if the JSON string is invalid with respect to WhatsappBusinessAccount
  */
  public static WhatsappBusinessAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappBusinessAccount.class);
  }

 /**
  * Convert an instance of WhatsappBusinessAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

