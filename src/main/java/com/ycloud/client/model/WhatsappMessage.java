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
import com.ycloud.client.model.WhatsappMessageContact;
import com.ycloud.client.model.WhatsappMessageInteractive;
import com.ycloud.client.model.WhatsappMessageLocation;
import com.ycloud.client.model.WhatsappMessageMedia;
import com.ycloud.client.model.WhatsappMessageTemplate;
import com.ycloud.client.model.WhatsappMessageText;
import com.ycloud.client.model.WhatsappMessageType;
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
 * WhatsApp outbound message object.
 */
@ApiModel(description = "WhatsApp outbound message object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private WhatsappMessageType type;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private WhatsappMessageTemplate template;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private WhatsappMessageText text;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private WhatsappMessageMedia image;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private WhatsappMessageMedia video;

  public static final String SERIALIZED_NAME_AUDIO = "audio";
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private WhatsappMessageMedia audio;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private WhatsappMessageMedia document;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private WhatsappMessageLocation location;

  public static final String SERIALIZED_NAME_INTERACTIVE = "interactive";
  @SerializedName(SERIALIZED_NAME_INTERACTIVE)
  private WhatsappMessageInteractive interactive;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<WhatsappMessageContact> contacts = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Date createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private Date updateTime;

  public WhatsappMessage() { 
  }

  public WhatsappMessage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for the object.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique ID for the object.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WhatsappMessage from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+447901614024", required = true, value = "The sender's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public WhatsappMessage to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+447901614024", required = true, value = "The recipient's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public WhatsappMessage type(WhatsappMessageType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WhatsappMessageType getType() {
    return type;
  }


  public void setType(WhatsappMessageType type) {
    this.type = type;
  }


  public WhatsappMessage template(WhatsappMessageTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappMessageTemplate getTemplate() {
    return template;
  }


  public void setTemplate(WhatsappMessageTemplate template) {
    this.template = template;
  }


  public WhatsappMessage text(WhatsappMessageText text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappMessageText getText() {
    return text;
  }


  public void setText(WhatsappMessageText text) {
    this.text = text;
  }


  public WhatsappMessage image(WhatsappMessageMedia image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappMessageMedia getImage() {
    return image;
  }


  public void setImage(WhatsappMessageMedia image) {
    this.image = image;
  }


  public WhatsappMessage video(WhatsappMessageMedia video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappMessageMedia getVideo() {
    return video;
  }


  public void setVideo(WhatsappMessageMedia video) {
    this.video = video;
  }


  public WhatsappMessage audio(WhatsappMessageMedia audio) {
    
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappMessageMedia getAudio() {
    return audio;
  }


  public void setAudio(WhatsappMessageMedia audio) {
    this.audio = audio;
  }


  public WhatsappMessage document(WhatsappMessageMedia document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappMessageMedia getDocument() {
    return document;
  }


  public void setDocument(WhatsappMessageMedia document) {
    this.document = document;
  }


  public WhatsappMessage location(WhatsappMessageLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappMessageLocation getLocation() {
    return location;
  }


  public void setLocation(WhatsappMessageLocation location) {
    this.location = location;
  }


  public WhatsappMessage interactive(WhatsappMessageInteractive interactive) {
    
    this.interactive = interactive;
    return this;
  }

   /**
   * Get interactive
   * @return interactive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappMessageInteractive getInteractive() {
    return interactive;
  }


  public void setInteractive(WhatsappMessageInteractive interactive) {
    this.interactive = interactive;
  }


  public WhatsappMessage contacts(List<WhatsappMessageContact> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public WhatsappMessage addContactsItem(WhatsappMessageContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WhatsappMessageContact> getContacts() {
    return contacts;
  }


  public void setContacts(List<WhatsappMessageContact> contacts) {
    this.contacts = contacts;
  }


  public WhatsappMessage externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public WhatsappMessage status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;failed&#x60;, &#x60;delivered&#x60;, &#x60;read&#x60;. - &#x60;accepted&#x60;: The messaging request is accepted by our system. - &#x60;sent&#x60;: A message sent by your business is in transit within WhatsApp&#39;s systems. - &#x60;failed&#x60;: A message sent by your business failed to send. - &#x60;delivered&#x60;: A message sent by your business was delivered to the user&#39;s device. - &#x60;read&#x60;: A message sent by your business was read by the user.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One of `accepted`, `sent`, `failed`, `delivered`, `read`. - `accepted`: The messaging request is accepted by our system. - `sent`: A message sent by your business is in transit within WhatsApp's systems. - `failed`: A message sent by your business failed to send. - `delivered`: A message sent by your business was delivered to the user's device. - `read`: A message sent by your business was read by the user.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public WhatsappMessage errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code when the message status is &#x60;failed&#x60;.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error code when the message status is `failed`.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public WhatsappMessage errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message when the message status is &#x60;failed&#x60;.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error message when the message status is `failed`.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public WhatsappMessage createTime(Date createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The time at which this message is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which this message is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")

  public Date getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public WhatsappMessage updateTime(Date updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The time at which this message is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which this message is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")

  public Date getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
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
  public WhatsappMessage putAdditionalProperty(String key, Object value) {
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
    WhatsappMessage whatsappMessage = (WhatsappMessage) o;
    return Objects.equals(this.id, whatsappMessage.id) &&
        Objects.equals(this.from, whatsappMessage.from) &&
        Objects.equals(this.to, whatsappMessage.to) &&
        Objects.equals(this.type, whatsappMessage.type) &&
        Objects.equals(this.template, whatsappMessage.template) &&
        Objects.equals(this.text, whatsappMessage.text) &&
        Objects.equals(this.image, whatsappMessage.image) &&
        Objects.equals(this.video, whatsappMessage.video) &&
        Objects.equals(this.audio, whatsappMessage.audio) &&
        Objects.equals(this.document, whatsappMessage.document) &&
        Objects.equals(this.location, whatsappMessage.location) &&
        Objects.equals(this.interactive, whatsappMessage.interactive) &&
        Objects.equals(this.contacts, whatsappMessage.contacts) &&
        Objects.equals(this.externalId, whatsappMessage.externalId) &&
        Objects.equals(this.status, whatsappMessage.status) &&
        Objects.equals(this.errorCode, whatsappMessage.errorCode) &&
        Objects.equals(this.errorMessage, whatsappMessage.errorMessage) &&
        Objects.equals(this.createTime, whatsappMessage.createTime) &&
        Objects.equals(this.updateTime, whatsappMessage.updateTime)&&
        Objects.equals(this.additionalProperties, whatsappMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, type, template, text, image, video, audio, document, location, interactive, contacts, externalId, status, errorCode, errorMessage, createTime, updateTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    interactive: ").append(toIndentedString(interactive)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("type");
    openapiFields.add("template");
    openapiFields.add("text");
    openapiFields.add("image");
    openapiFields.add("video");
    openapiFields.add("audio");
    openapiFields.add("document");
    openapiFields.add("location");
    openapiFields.add("interactive");
    openapiFields.add("contacts");
    openapiFields.add("externalId");
    openapiFields.add("status");
    openapiFields.add("errorCode");
    openapiFields.add("errorMessage");
    openapiFields.add("createTime");
    openapiFields.add("updateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessage is not found in the empty JSON string", WhatsappMessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("from") != null && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      // validate the optional field `template`
      if (jsonObj.getAsJsonObject("template") != null) {
        WhatsappMessageTemplate.validateJsonObject(jsonObj.getAsJsonObject("template"));
      }
      // validate the optional field `text`
      if (jsonObj.getAsJsonObject("text") != null) {
        WhatsappMessageText.validateJsonObject(jsonObj.getAsJsonObject("text"));
      }
      // validate the optional field `image`
      if (jsonObj.getAsJsonObject("image") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("image"));
      }
      // validate the optional field `video`
      if (jsonObj.getAsJsonObject("video") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("video"));
      }
      // validate the optional field `audio`
      if (jsonObj.getAsJsonObject("audio") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("audio"));
      }
      // validate the optional field `document`
      if (jsonObj.getAsJsonObject("document") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("document"));
      }
      // validate the optional field `location`
      if (jsonObj.getAsJsonObject("location") != null) {
        WhatsappMessageLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `interactive`
      if (jsonObj.getAsJsonObject("interactive") != null) {
        WhatsappMessageInteractive.validateJsonObject(jsonObj.getAsJsonObject("interactive"));
      }
      JsonArray jsonArraycontacts = jsonObj.getAsJsonArray("contacts");
      if (jsonArraycontacts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("contacts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `contacts` to be an array in the JSON string but got `%s`", jsonObj.get("contacts").toString()));
        }

        // validate the optional field `contacts` (array)
        for (int i = 0; i < jsonArraycontacts.size(); i++) {
          WhatsappMessageContact.validateJsonObject(jsonArraycontacts.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      if (jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessage>() {
           @Override
           public void write(JsonWriter out, WhatsappMessage value) throws IOException {
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
           public WhatsappMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessage
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessage
  */
  public static WhatsappMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessage.class);
  }

 /**
  * Convert an instance of WhatsappMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

