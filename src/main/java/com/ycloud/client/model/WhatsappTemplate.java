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
import com.ycloud.client.model.WhatsappApiError;
import com.ycloud.client.model.WhatsappTemplateCategory;
import com.ycloud.client.model.WhatsappTemplateComponent;
import com.ycloud.client.model.WhatsappTemplateQualityRating;
import com.ycloud.client.model.WhatsappTemplateStatus;
import com.ycloud.client.model.WhatsappTemplateStatusUpdateEventEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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
 * See [WhatsApp Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates).
 */
@ApiModel(description = "See [WhatsApp Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappTemplate {
  public static final String SERIALIZED_NAME_WABA_ID = "wabaId";
  /**
   * WhatsApp Business Account ID.
  **/
  @SerializedName(SERIALIZED_NAME_WABA_ID)
  private String wabaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  /**
   * Name of the template.
  **/
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  /**
   * Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes.
  **/
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private WhatsappTemplateCategory category;

  public static final String SERIALIZED_NAME_PREVIOUS_CATEGORY = "previousCategory";
  /**
   * This field indicates the template&#39;s previous category (or &#x60;null&#x60;, for newly created templates after April 1, 2023). Compare this value to the template&#39;s &#x60;category&#x60; field value, which indicates the template&#39;s current category. For more information about template category migration, see also [First template category migration](https://developers.facebook.com/docs/whatsapp/updates-to-pricing/launch-timeline#first-template-category-migration).
  **/
  @SerializedName(SERIALIZED_NAME_PREVIOUS_CATEGORY)
  private String previousCategory;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  /**
   * Template components. A template consists of &#x60;HEADER&#x60;, &#x60;BODY&#x60;, &#x60;FOOTER&#x60;, and &#x60;BUTTONS&#x60; components. &#x60;BODY&#x60; component is required, the other types are optional.
  **/
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<WhatsappTemplateComponent> components = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WhatsappTemplateStatus status;

  public static final String SERIALIZED_NAME_QUALITY_RATING = "qualityRating";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_QUALITY_RATING)
  private WhatsappTemplateQualityRating qualityRating;

  public static final String SERIALIZED_NAME_REASON = "reason";
  /**
   * The reason why the template is rejected.
  **/
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  /**
   * The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Date createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  /**
   * The time at which this object is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private Date updateTime;

  public static final String SERIALIZED_NAME_STATUS_UPDATE_EVENT = "statusUpdateEvent";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_STATUS_UPDATE_EVENT)
  private WhatsappTemplateStatusUpdateEventEnum statusUpdateEvent;

  public static final String SERIALIZED_NAME_DISABLE_DATE = "disableDate";
  /**
   * The date at which the template will be disabled. When a WhatsApp template &#x60;FLAGGED&#x60; event is received, this field is set.
  **/
  @SerializedName(SERIALIZED_NAME_DISABLE_DATE)
  private String disableDate;

  public static final String SERIALIZED_NAME_WHATSAPP_API_ERROR = "whatsappApiError";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_WHATSAPP_API_ERROR)
  private WhatsappApiError whatsappApiError;

  public WhatsappTemplate() { 
  }

  public WhatsappTemplate wabaId(String wabaId) {
    
    this.wabaId = wabaId;
    return this;
  }

   /**
   * WhatsApp Business Account ID.
   * @return wabaId
  **/
  @javax.annotation.Nonnull

  public String getWabaId() {
    return wabaId;
  }


  /**
   * WhatsApp Business Account ID.
   **/
  @ApiModelProperty(example = "whatsapp-business-account-id", required = true, value = "WhatsApp Business Account ID.")
  public void setWabaId(String wabaId) {
    this.wabaId = wabaId;
  }


  public WhatsappTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the template.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  /**
   * Name of the template.
   **/
  @ApiModelProperty(required = true, value = "Name of the template.")
  public void setName(String name) {
    this.name = name;
  }


  public WhatsappTemplate language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes.
   * @return language
  **/
  @javax.annotation.Nonnull

  public String getLanguage() {
    return language;
  }


  /**
   * Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes.
   **/
  @ApiModelProperty(example = "en", required = true, value = "Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes.")
  public void setLanguage(String language) {
    this.language = language;
  }


  public WhatsappTemplate category(WhatsappTemplateCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull

  public WhatsappTemplateCategory getCategory() {
    return category;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setCategory(WhatsappTemplateCategory category) {
    this.category = category;
  }


  public WhatsappTemplate previousCategory(String previousCategory) {
    
    this.previousCategory = previousCategory;
    return this;
  }

   /**
   * This field indicates the template&#39;s previous category (or &#x60;null&#x60;, for newly created templates after April 1, 2023). Compare this value to the template&#39;s &#x60;category&#x60; field value, which indicates the template&#39;s current category. For more information about template category migration, see also [First template category migration](https://developers.facebook.com/docs/whatsapp/updates-to-pricing/launch-timeline#first-template-category-migration).
   * @return previousCategory
  **/
  @javax.annotation.Nullable

  public String getPreviousCategory() {
    return previousCategory;
  }


  /**
   * This field indicates the template&#39;s previous category (or &#x60;null&#x60;, for newly created templates after April 1, 2023). Compare this value to the template&#39;s &#x60;category&#x60; field value, which indicates the template&#39;s current category. For more information about template category migration, see also [First template category migration](https://developers.facebook.com/docs/whatsapp/updates-to-pricing/launch-timeline#first-template-category-migration).
   **/
  @ApiModelProperty(value = "This field indicates the template's previous category (or `null`, for newly created templates after April 1, 2023). Compare this value to the template's `category` field value, which indicates the template's current category. For more information about template category migration, see also [First template category migration](https://developers.facebook.com/docs/whatsapp/updates-to-pricing/launch-timeline#first-template-category-migration).")
  public void setPreviousCategory(String previousCategory) {
    this.previousCategory = previousCategory;
  }


  public WhatsappTemplate components(List<WhatsappTemplateComponent> components) {
    
    this.components = components;
    return this;
  }

  public WhatsappTemplate addComponentsItem(WhatsappTemplateComponent componentsItem) {
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Template components. A template consists of &#x60;HEADER&#x60;, &#x60;BODY&#x60;, &#x60;FOOTER&#x60;, and &#x60;BUTTONS&#x60; components. &#x60;BODY&#x60; component is required, the other types are optional.
   * @return components
  **/
  @javax.annotation.Nonnull

  public List<WhatsappTemplateComponent> getComponents() {
    return components;
  }


  /**
   * Template components. A template consists of &#x60;HEADER&#x60;, &#x60;BODY&#x60;, &#x60;FOOTER&#x60;, and &#x60;BUTTONS&#x60; components. &#x60;BODY&#x60; component is required, the other types are optional.
   **/
  @ApiModelProperty(required = true, value = "Template components. A template consists of `HEADER`, `BODY`, `FOOTER`, and `BUTTONS` components. `BODY` component is required, the other types are optional.")
  public void setComponents(List<WhatsappTemplateComponent> components) {
    this.components = components;
  }


  public WhatsappTemplate status(WhatsappTemplateStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public WhatsappTemplateStatus getStatus() {
    return status;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setStatus(WhatsappTemplateStatus status) {
    this.status = status;
  }


  public WhatsappTemplate qualityRating(WhatsappTemplateQualityRating qualityRating) {
    
    this.qualityRating = qualityRating;
    return this;
  }

   /**
   * Get qualityRating
   * @return qualityRating
  **/
  @javax.annotation.Nullable

  public WhatsappTemplateQualityRating getQualityRating() {
    return qualityRating;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setQualityRating(WhatsappTemplateQualityRating qualityRating) {
    this.qualityRating = qualityRating;
  }


  public WhatsappTemplate reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason why the template is rejected.
   * @return reason
  **/
  @javax.annotation.Nullable

  public String getReason() {
    return reason;
  }


  /**
   * The reason why the template is rejected.
   **/
  @ApiModelProperty(value = "The reason why the template is rejected.")
  public void setReason(String reason) {
    this.reason = reason;
  }


  public WhatsappTemplate createTime(Date createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return createTime
  **/
  @javax.annotation.Nullable

  public Date getCreateTime() {
    return createTime;
  }


  /**
   * The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   **/
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public WhatsappTemplate updateTime(Date updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The time at which this object is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return updateTime
  **/
  @javax.annotation.Nullable

  public Date getUpdateTime() {
    return updateTime;
  }


  /**
   * The time at which this object is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   **/
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which this object is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public WhatsappTemplate statusUpdateEvent(WhatsappTemplateStatusUpdateEventEnum statusUpdateEvent) {
    
    this.statusUpdateEvent = statusUpdateEvent;
    return this;
  }

   /**
   * Get statusUpdateEvent
   * @return statusUpdateEvent
  **/
  @javax.annotation.Nullable

  public WhatsappTemplateStatusUpdateEventEnum getStatusUpdateEvent() {
    return statusUpdateEvent;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setStatusUpdateEvent(WhatsappTemplateStatusUpdateEventEnum statusUpdateEvent) {
    this.statusUpdateEvent = statusUpdateEvent;
  }


  public WhatsappTemplate disableDate(String disableDate) {
    
    this.disableDate = disableDate;
    return this;
  }

   /**
   * The date at which the template will be disabled. When a WhatsApp template &#x60;FLAGGED&#x60; event is received, this field is set.
   * @return disableDate
  **/
  @javax.annotation.Nullable

  public String getDisableDate() {
    return disableDate;
  }


  /**
   * The date at which the template will be disabled. When a WhatsApp template &#x60;FLAGGED&#x60; event is received, this field is set.
   **/
  @ApiModelProperty(example = "December 9, 2022", value = "The date at which the template will be disabled. When a WhatsApp template `FLAGGED` event is received, this field is set.")
  public void setDisableDate(String disableDate) {
    this.disableDate = disableDate;
  }


  public WhatsappTemplate whatsappApiError(WhatsappApiError whatsappApiError) {
    
    this.whatsappApiError = whatsappApiError;
    return this;
  }

   /**
   * Get whatsappApiError
   * @return whatsappApiError
  **/
  @javax.annotation.Nullable

  public WhatsappApiError getWhatsappApiError() {
    return whatsappApiError;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setWhatsappApiError(WhatsappApiError whatsappApiError) {
    this.whatsappApiError = whatsappApiError;
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
  public WhatsappTemplate putAdditionalProperty(String key, Object value) {
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
    WhatsappTemplate whatsappTemplate = (WhatsappTemplate) o;
    return Objects.equals(this.wabaId, whatsappTemplate.wabaId) &&
        Objects.equals(this.name, whatsappTemplate.name) &&
        Objects.equals(this.language, whatsappTemplate.language) &&
        Objects.equals(this.category, whatsappTemplate.category) &&
        Objects.equals(this.previousCategory, whatsappTemplate.previousCategory) &&
        Objects.equals(this.components, whatsappTemplate.components) &&
        Objects.equals(this.status, whatsappTemplate.status) &&
        Objects.equals(this.qualityRating, whatsappTemplate.qualityRating) &&
        Objects.equals(this.reason, whatsappTemplate.reason) &&
        Objects.equals(this.createTime, whatsappTemplate.createTime) &&
        Objects.equals(this.updateTime, whatsappTemplate.updateTime) &&
        Objects.equals(this.statusUpdateEvent, whatsappTemplate.statusUpdateEvent) &&
        Objects.equals(this.disableDate, whatsappTemplate.disableDate) &&
        Objects.equals(this.whatsappApiError, whatsappTemplate.whatsappApiError)&&
        Objects.equals(this.additionalProperties, whatsappTemplate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wabaId, name, language, category, previousCategory, components, status, qualityRating, reason, createTime, updateTime, statusUpdateEvent, disableDate, whatsappApiError, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappTemplate {\n");
    sb.append("    wabaId: ").append(toIndentedString(wabaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    previousCategory: ").append(toIndentedString(previousCategory)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    qualityRating: ").append(toIndentedString(qualityRating)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    statusUpdateEvent: ").append(toIndentedString(statusUpdateEvent)).append("\n");
    sb.append("    disableDate: ").append(toIndentedString(disableDate)).append("\n");
    sb.append("    whatsappApiError: ").append(toIndentedString(whatsappApiError)).append("\n");
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
    openapiFields.add("wabaId");
    openapiFields.add("name");
    openapiFields.add("language");
    openapiFields.add("category");
    openapiFields.add("previousCategory");
    openapiFields.add("components");
    openapiFields.add("status");
    openapiFields.add("qualityRating");
    openapiFields.add("reason");
    openapiFields.add("createTime");
    openapiFields.add("updateTime");
    openapiFields.add("statusUpdateEvent");
    openapiFields.add("disableDate");
    openapiFields.add("whatsappApiError");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("wabaId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("components");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappTemplate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappTemplate is not found in the empty JSON string", WhatsappTemplate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappTemplate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("wabaId") != null && !jsonObj.get("wabaId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wabaId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wabaId").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("previousCategory") != null && !jsonObj.get("previousCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousCategory").toString()));
      }
      JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
      if (jsonArraycomponents != null) {
        // ensure the json data is an array
        if (!jsonObj.get("components").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
        }

        // validate the optional field `components` (array)
        for (int i = 0; i < jsonArraycomponents.size(); i++) {
          WhatsappTemplateComponent.validateJsonObject(jsonArraycomponents.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (jsonObj.get("disableDate") != null && !jsonObj.get("disableDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disableDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disableDate").toString()));
      }
      // validate the optional field `whatsappApiError`
      if (jsonObj.getAsJsonObject("whatsappApiError") != null) {
        WhatsappApiError.validateJsonObject(jsonObj.getAsJsonObject("whatsappApiError"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappTemplate>() {
           @Override
           public void write(JsonWriter out, WhatsappTemplate value) throws IOException {
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
           public WhatsappTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappTemplate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappTemplate
  * @throws IOException if the JSON string is invalid with respect to WhatsappTemplate
  */
  public static WhatsappTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappTemplate.class);
  }

 /**
  * Convert an instance of WhatsappTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

