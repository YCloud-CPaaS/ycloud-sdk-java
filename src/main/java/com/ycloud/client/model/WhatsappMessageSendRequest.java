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
import com.ycloud.client.model.WhatsappMessageContext;
import com.ycloud.client.model.WhatsappMessageInteractive;
import com.ycloud.client.model.WhatsappMessageLocation;
import com.ycloud.client.model.WhatsappMessageMedia;
import com.ycloud.client.model.WhatsappMessageReaction;
import com.ycloud.client.model.WhatsappMessageTemplate;
import com.ycloud.client.model.WhatsappMessageText;
import com.ycloud.client.model.WhatsappMessageType;
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
 * WhatsappMessageSendRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageSendRequest {
  public static final String SERIALIZED_NAME_FROM = "from";
  /**
   * The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
  **/
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
  **/
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private WhatsappMessageType type;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private WhatsappMessageTemplate template;

  public static final String SERIALIZED_NAME_TEXT = "text";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_TEXT)
  private WhatsappMessageText text;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private WhatsappMessageMedia image;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private WhatsappMessageMedia video;

  public static final String SERIALIZED_NAME_AUDIO = "audio";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private WhatsappMessageMedia audio;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private WhatsappMessageMedia document;

  public static final String SERIALIZED_NAME_STICKER = "sticker";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_STICKER)
  private WhatsappMessageMedia sticker;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private WhatsappMessageLocation location;

  public static final String SERIALIZED_NAME_INTERACTIVE = "interactive";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_INTERACTIVE)
  private WhatsappMessageInteractive interactive;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  /**
   * Required when &#x60;type&#x60; is &#x60;contacts&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<WhatsappMessageContact> contacts = null;

  public static final String SERIALIZED_NAME_REACTION = "reaction";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_REACTION)
  private WhatsappMessageReaction reaction;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private WhatsappMessageContext context;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  /**
   * A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
  **/
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_FILTER_UNSUBSCRIBED = "filterUnsubscribed";
  /**
   * **Optional.** If set to &#x60;true&#x60;, the message will not be sent to users who have unsubscribed from your account. Defaults to &#x60;false&#x60;.  Only use for &#x60;POST /v2/whatsapp/messages&#x60;. If the user has unsubscribed, we will push webhook notifications with &#x60;whatsappMessage.errorCode&#x60; set to &#x60;RECIPIENT_UNSUBSCRIBED&#x60;.  Not applicable to &#x60;POST /v2/whatsapp/message/sendDirectly&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_FILTER_UNSUBSCRIBED)
  private Boolean filterUnsubscribed;

  public WhatsappMessageSendRequest() { 
  }

  public WhatsappMessageSendRequest from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return from
  **/
  @javax.annotation.Nonnull

  public String getFrom() {
    return from;
  }


  /**
   * The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   **/
  @ApiModelProperty(example = "+16315551111", required = true, value = "The sender's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")
  public void setFrom(String from) {
    this.from = from;
  }


  public WhatsappMessageSendRequest to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return to
  **/
  @javax.annotation.Nonnull

  public String getTo() {
    return to;
  }


  /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   **/
  @ApiModelProperty(example = "+16315551111", required = true, value = "The recipient's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")
  public void setTo(String to) {
    this.to = to;
  }


  public WhatsappMessageSendRequest type(WhatsappMessageType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public WhatsappMessageType getType() {
    return type;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setType(WhatsappMessageType type) {
    this.type = type;
  }


  public WhatsappMessageSendRequest template(WhatsappMessageTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable

  public WhatsappMessageTemplate getTemplate() {
    return template;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setTemplate(WhatsappMessageTemplate template) {
    this.template = template;
  }


  public WhatsappMessageSendRequest text(WhatsappMessageText text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable

  public WhatsappMessageText getText() {
    return text;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setText(WhatsappMessageText text) {
    this.text = text;
  }


  public WhatsappMessageSendRequest image(WhatsappMessageMedia image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable

  public WhatsappMessageMedia getImage() {
    return image;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setImage(WhatsappMessageMedia image) {
    this.image = image;
  }


  public WhatsappMessageSendRequest video(WhatsappMessageMedia video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable

  public WhatsappMessageMedia getVideo() {
    return video;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setVideo(WhatsappMessageMedia video) {
    this.video = video;
  }


  public WhatsappMessageSendRequest audio(WhatsappMessageMedia audio) {
    
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @javax.annotation.Nullable

  public WhatsappMessageMedia getAudio() {
    return audio;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setAudio(WhatsappMessageMedia audio) {
    this.audio = audio;
  }


  public WhatsappMessageSendRequest document(WhatsappMessageMedia document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable

  public WhatsappMessageMedia getDocument() {
    return document;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setDocument(WhatsappMessageMedia document) {
    this.document = document;
  }


  public WhatsappMessageSendRequest sticker(WhatsappMessageMedia sticker) {
    
    this.sticker = sticker;
    return this;
  }

   /**
   * Get sticker
   * @return sticker
  **/
  @javax.annotation.Nullable

  public WhatsappMessageMedia getSticker() {
    return sticker;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setSticker(WhatsappMessageMedia sticker) {
    this.sticker = sticker;
  }


  public WhatsappMessageSendRequest location(WhatsappMessageLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public WhatsappMessageLocation getLocation() {
    return location;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setLocation(WhatsappMessageLocation location) {
    this.location = location;
  }


  public WhatsappMessageSendRequest interactive(WhatsappMessageInteractive interactive) {
    
    this.interactive = interactive;
    return this;
  }

   /**
   * Get interactive
   * @return interactive
  **/
  @javax.annotation.Nullable

  public WhatsappMessageInteractive getInteractive() {
    return interactive;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setInteractive(WhatsappMessageInteractive interactive) {
    this.interactive = interactive;
  }


  public WhatsappMessageSendRequest contacts(List<WhatsappMessageContact> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public WhatsappMessageSendRequest addContactsItem(WhatsappMessageContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Required when &#x60;type&#x60; is &#x60;contacts&#x60;.
   * @return contacts
  **/
  @javax.annotation.Nullable

  public List<WhatsappMessageContact> getContacts() {
    return contacts;
  }


  /**
   * Required when &#x60;type&#x60; is &#x60;contacts&#x60;.
   **/
  @ApiModelProperty(value = "Required when `type` is `contacts`.")
  public void setContacts(List<WhatsappMessageContact> contacts) {
    this.contacts = contacts;
  }


  public WhatsappMessageSendRequest reaction(WhatsappMessageReaction reaction) {
    
    this.reaction = reaction;
    return this;
  }

   /**
   * Get reaction
   * @return reaction
  **/
  @javax.annotation.Nullable

  public WhatsappMessageReaction getReaction() {
    return reaction;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setReaction(WhatsappMessageReaction reaction) {
    this.reaction = reaction;
  }


  public WhatsappMessageSendRequest context(WhatsappMessageContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable

  public WhatsappMessageContext getContext() {
    return context;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setContext(WhatsappMessageContext context) {
    this.context = context;
  }


  public WhatsappMessageSendRequest externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
   * @return externalId
  **/
  @javax.annotation.Nullable

  public String getExternalId() {
    return externalId;
  }


  /**
   * A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
   **/
  @ApiModelProperty(value = "A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public WhatsappMessageSendRequest filterUnsubscribed(Boolean filterUnsubscribed) {
    
    this.filterUnsubscribed = filterUnsubscribed;
    return this;
  }

   /**
   * **Optional.** If set to &#x60;true&#x60;, the message will not be sent to users who have unsubscribed from your account. Defaults to &#x60;false&#x60;.  Only use for &#x60;POST /v2/whatsapp/messages&#x60;. If the user has unsubscribed, we will push webhook notifications with &#x60;whatsappMessage.errorCode&#x60; set to &#x60;RECIPIENT_UNSUBSCRIBED&#x60;.  Not applicable to &#x60;POST /v2/whatsapp/message/sendDirectly&#x60;.
   * @return filterUnsubscribed
  **/
  @javax.annotation.Nullable

  public Boolean getFilterUnsubscribed() {
    return filterUnsubscribed;
  }


  /**
   * **Optional.** If set to &#x60;true&#x60;, the message will not be sent to users who have unsubscribed from your account. Defaults to &#x60;false&#x60;.  Only use for &#x60;POST /v2/whatsapp/messages&#x60;. If the user has unsubscribed, we will push webhook notifications with &#x60;whatsappMessage.errorCode&#x60; set to &#x60;RECIPIENT_UNSUBSCRIBED&#x60;.  Not applicable to &#x60;POST /v2/whatsapp/message/sendDirectly&#x60;.
   **/
  @ApiModelProperty(value = "**Optional.** If set to `true`, the message will not be sent to users who have unsubscribed from your account. Defaults to `false`.  Only use for `POST /v2/whatsapp/messages`. If the user has unsubscribed, we will push webhook notifications with `whatsappMessage.errorCode` set to `RECIPIENT_UNSUBSCRIBED`.  Not applicable to `POST /v2/whatsapp/message/sendDirectly`.")
  public void setFilterUnsubscribed(Boolean filterUnsubscribed) {
    this.filterUnsubscribed = filterUnsubscribed;
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
  public WhatsappMessageSendRequest putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageSendRequest whatsappMessageSendRequest = (WhatsappMessageSendRequest) o;
    return Objects.equals(this.from, whatsappMessageSendRequest.from) &&
        Objects.equals(this.to, whatsappMessageSendRequest.to) &&
        Objects.equals(this.type, whatsappMessageSendRequest.type) &&
        Objects.equals(this.template, whatsappMessageSendRequest.template) &&
        Objects.equals(this.text, whatsappMessageSendRequest.text) &&
        Objects.equals(this.image, whatsappMessageSendRequest.image) &&
        Objects.equals(this.video, whatsappMessageSendRequest.video) &&
        Objects.equals(this.audio, whatsappMessageSendRequest.audio) &&
        Objects.equals(this.document, whatsappMessageSendRequest.document) &&
        Objects.equals(this.sticker, whatsappMessageSendRequest.sticker) &&
        Objects.equals(this.location, whatsappMessageSendRequest.location) &&
        Objects.equals(this.interactive, whatsappMessageSendRequest.interactive) &&
        Objects.equals(this.contacts, whatsappMessageSendRequest.contacts) &&
        Objects.equals(this.reaction, whatsappMessageSendRequest.reaction) &&
        Objects.equals(this.context, whatsappMessageSendRequest.context) &&
        Objects.equals(this.externalId, whatsappMessageSendRequest.externalId) &&
        Objects.equals(this.filterUnsubscribed, whatsappMessageSendRequest.filterUnsubscribed)&&
        Objects.equals(this.additionalProperties, whatsappMessageSendRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, type, template, text, image, video, audio, document, sticker, location, interactive, contacts, reaction, context, externalId, filterUnsubscribed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageSendRequest {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    sticker: ").append(toIndentedString(sticker)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    interactive: ").append(toIndentedString(interactive)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    filterUnsubscribed: ").append(toIndentedString(filterUnsubscribed)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("type");
    openapiFields.add("template");
    openapiFields.add("text");
    openapiFields.add("image");
    openapiFields.add("video");
    openapiFields.add("audio");
    openapiFields.add("document");
    openapiFields.add("sticker");
    openapiFields.add("location");
    openapiFields.add("interactive");
    openapiFields.add("contacts");
    openapiFields.add("reaction");
    openapiFields.add("context");
    openapiFields.add("externalId");
    openapiFields.add("filterUnsubscribed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageSendRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageSendRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageSendRequest is not found in the empty JSON string", WhatsappMessageSendRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappMessageSendRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
      // validate the optional field `sticker`
      if (jsonObj.getAsJsonObject("sticker") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("sticker"));
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
      // validate the optional field `reaction`
      if (jsonObj.getAsJsonObject("reaction") != null) {
        WhatsappMessageReaction.validateJsonObject(jsonObj.getAsJsonObject("reaction"));
      }
      // validate the optional field `context`
      if (jsonObj.getAsJsonObject("context") != null) {
        WhatsappMessageContext.validateJsonObject(jsonObj.getAsJsonObject("context"));
      }
      if (jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageSendRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageSendRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageSendRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageSendRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageSendRequest>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageSendRequest value) throws IOException {
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
           public WhatsappMessageSendRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageSendRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageSendRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageSendRequest
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageSendRequest
  */
  public static WhatsappMessageSendRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageSendRequest.class);
  }

 /**
  * Convert an instance of WhatsappMessageSendRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

