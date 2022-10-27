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
import com.ycloud.client.model.WhatsappInboundMessageButton;
import com.ycloud.client.model.WhatsappInboundMessageInteractive;
import com.ycloud.client.model.WhatsappInboundMessageLocation;
import com.ycloud.client.model.WhatsappInboundMessageMedia;
import com.ycloud.client.model.WhatsappInboundMessageText;
import com.ycloud.client.model.WhatsappInboundMessageType;
import com.ycloud.client.model.WhatsappMessageContact;
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
 * WhatsApp inbound message object.
 */
@ApiModel(description = "WhatsApp inbound message object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappInboundMessage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WABA_ID = "wabaId";
  @SerializedName(SERIALIZED_NAME_WABA_ID)
  private String wabaId;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_SEND_TIME = "sendTime";
  @SerializedName(SERIALIZED_NAME_SEND_TIME)
  private Date sendTime;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private WhatsappInboundMessageType type;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private WhatsappInboundMessageText text;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private WhatsappInboundMessageMedia image;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private WhatsappInboundMessageMedia video;

  public static final String SERIALIZED_NAME_AUDIO = "audio";
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private WhatsappInboundMessageMedia audio;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private WhatsappInboundMessageMedia document;

  public static final String SERIALIZED_NAME_STICKER = "sticker";
  @SerializedName(SERIALIZED_NAME_STICKER)
  private WhatsappInboundMessageMedia sticker;

  public static final String SERIALIZED_NAME_INTERACTIVE = "interactive";
  @SerializedName(SERIALIZED_NAME_INTERACTIVE)
  private WhatsappInboundMessageInteractive interactive;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private WhatsappInboundMessageLocation location;

  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private WhatsappInboundMessageButton button;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<WhatsappMessageContact> contacts = null;

  public WhatsappInboundMessage() { 
  }

  public WhatsappInboundMessage id(String id) {
    
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


  public WhatsappInboundMessage wabaId(String wabaId) {
    
    this.wabaId = wabaId;
    return this;
  }

   /**
   * WhatsApp Business Account ID.
   * @return wabaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whatsapp-business-account-id", value = "WhatsApp Business Account ID.")

  public String getWabaId() {
    return wabaId;
  }


  public void setWabaId(String wabaId) {
    this.wabaId = wabaId;
  }


  public WhatsappInboundMessage from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+447901614024", value = "The sender's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public WhatsappInboundMessage to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+447901614024", value = "The recipient's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public WhatsappInboundMessage sendTime(Date sendTime) {
    
    this.sendTime = sendTime;
    return this;
  }

   /**
   * The time at which this message is sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return sendTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which this message is sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")

  public Date getSendTime() {
    return sendTime;
  }


  public void setSendTime(Date sendTime) {
    this.sendTime = sendTime;
  }


  public WhatsappInboundMessage type(WhatsappInboundMessageType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageType getType() {
    return type;
  }


  public void setType(WhatsappInboundMessageType type) {
    this.type = type;
  }


  public WhatsappInboundMessage text(WhatsappInboundMessageText text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageText getText() {
    return text;
  }


  public void setText(WhatsappInboundMessageText text) {
    this.text = text;
  }


  public WhatsappInboundMessage image(WhatsappInboundMessageMedia image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageMedia getImage() {
    return image;
  }


  public void setImage(WhatsappInboundMessageMedia image) {
    this.image = image;
  }


  public WhatsappInboundMessage video(WhatsappInboundMessageMedia video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageMedia getVideo() {
    return video;
  }


  public void setVideo(WhatsappInboundMessageMedia video) {
    this.video = video;
  }


  public WhatsappInboundMessage audio(WhatsappInboundMessageMedia audio) {
    
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageMedia getAudio() {
    return audio;
  }


  public void setAudio(WhatsappInboundMessageMedia audio) {
    this.audio = audio;
  }


  public WhatsappInboundMessage document(WhatsappInboundMessageMedia document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageMedia getDocument() {
    return document;
  }


  public void setDocument(WhatsappInboundMessageMedia document) {
    this.document = document;
  }


  public WhatsappInboundMessage sticker(WhatsappInboundMessageMedia sticker) {
    
    this.sticker = sticker;
    return this;
  }

   /**
   * Get sticker
   * @return sticker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageMedia getSticker() {
    return sticker;
  }


  public void setSticker(WhatsappInboundMessageMedia sticker) {
    this.sticker = sticker;
  }


  public WhatsappInboundMessage interactive(WhatsappInboundMessageInteractive interactive) {
    
    this.interactive = interactive;
    return this;
  }

   /**
   * Get interactive
   * @return interactive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageInteractive getInteractive() {
    return interactive;
  }


  public void setInteractive(WhatsappInboundMessageInteractive interactive) {
    this.interactive = interactive;
  }


  public WhatsappInboundMessage location(WhatsappInboundMessageLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageLocation getLocation() {
    return location;
  }


  public void setLocation(WhatsappInboundMessageLocation location) {
    this.location = location;
  }


  public WhatsappInboundMessage button(WhatsappInboundMessageButton button) {
    
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WhatsappInboundMessageButton getButton() {
    return button;
  }


  public void setButton(WhatsappInboundMessageButton button) {
    this.button = button;
  }


  public WhatsappInboundMessage contacts(List<WhatsappMessageContact> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public WhatsappInboundMessage addContactsItem(WhatsappMessageContact contactsItem) {
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
  public WhatsappInboundMessage putAdditionalProperty(String key, Object value) {
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
    WhatsappInboundMessage whatsappInboundMessage = (WhatsappInboundMessage) o;
    return Objects.equals(this.id, whatsappInboundMessage.id) &&
        Objects.equals(this.wabaId, whatsappInboundMessage.wabaId) &&
        Objects.equals(this.from, whatsappInboundMessage.from) &&
        Objects.equals(this.to, whatsappInboundMessage.to) &&
        Objects.equals(this.sendTime, whatsappInboundMessage.sendTime) &&
        Objects.equals(this.type, whatsappInboundMessage.type) &&
        Objects.equals(this.text, whatsappInboundMessage.text) &&
        Objects.equals(this.image, whatsappInboundMessage.image) &&
        Objects.equals(this.video, whatsappInboundMessage.video) &&
        Objects.equals(this.audio, whatsappInboundMessage.audio) &&
        Objects.equals(this.document, whatsappInboundMessage.document) &&
        Objects.equals(this.sticker, whatsappInboundMessage.sticker) &&
        Objects.equals(this.interactive, whatsappInboundMessage.interactive) &&
        Objects.equals(this.location, whatsappInboundMessage.location) &&
        Objects.equals(this.button, whatsappInboundMessage.button) &&
        Objects.equals(this.contacts, whatsappInboundMessage.contacts)&&
        Objects.equals(this.additionalProperties, whatsappInboundMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, wabaId, from, to, sendTime, type, text, image, video, audio, document, sticker, interactive, location, button, contacts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappInboundMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    wabaId: ").append(toIndentedString(wabaId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    sticker: ").append(toIndentedString(sticker)).append("\n");
    sb.append("    interactive: ").append(toIndentedString(interactive)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
    openapiFields.add("wabaId");
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("sendTime");
    openapiFields.add("type");
    openapiFields.add("text");
    openapiFields.add("image");
    openapiFields.add("video");
    openapiFields.add("audio");
    openapiFields.add("document");
    openapiFields.add("sticker");
    openapiFields.add("interactive");
    openapiFields.add("location");
    openapiFields.add("button");
    openapiFields.add("contacts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappInboundMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappInboundMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappInboundMessage is not found in the empty JSON string", WhatsappInboundMessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappInboundMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("wabaId") != null && !jsonObj.get("wabaId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wabaId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wabaId").toString()));
      }
      if (jsonObj.get("from") != null && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      // validate the optional field `text`
      if (jsonObj.getAsJsonObject("text") != null) {
        WhatsappInboundMessageText.validateJsonObject(jsonObj.getAsJsonObject("text"));
      }
      // validate the optional field `image`
      if (jsonObj.getAsJsonObject("image") != null) {
        WhatsappInboundMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("image"));
      }
      // validate the optional field `video`
      if (jsonObj.getAsJsonObject("video") != null) {
        WhatsappInboundMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("video"));
      }
      // validate the optional field `audio`
      if (jsonObj.getAsJsonObject("audio") != null) {
        WhatsappInboundMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("audio"));
      }
      // validate the optional field `document`
      if (jsonObj.getAsJsonObject("document") != null) {
        WhatsappInboundMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("document"));
      }
      // validate the optional field `sticker`
      if (jsonObj.getAsJsonObject("sticker") != null) {
        WhatsappInboundMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("sticker"));
      }
      // validate the optional field `interactive`
      if (jsonObj.getAsJsonObject("interactive") != null) {
        WhatsappInboundMessageInteractive.validateJsonObject(jsonObj.getAsJsonObject("interactive"));
      }
      // validate the optional field `location`
      if (jsonObj.getAsJsonObject("location") != null) {
        WhatsappInboundMessageLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `button`
      if (jsonObj.getAsJsonObject("button") != null) {
        WhatsappInboundMessageButton.validateJsonObject(jsonObj.getAsJsonObject("button"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappInboundMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappInboundMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappInboundMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappInboundMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappInboundMessage>() {
           @Override
           public void write(JsonWriter out, WhatsappInboundMessage value) throws IOException {
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
           public WhatsappInboundMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappInboundMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappInboundMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappInboundMessage
  * @throws IOException if the JSON string is invalid with respect to WhatsappInboundMessage
  */
  public static WhatsappInboundMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappInboundMessage.class);
  }

 /**
  * Convert an instance of WhatsappInboundMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
