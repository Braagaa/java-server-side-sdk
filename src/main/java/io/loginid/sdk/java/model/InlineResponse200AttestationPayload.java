/*
 * LoginID Service API
 * # Introduction  <span class=\"subtext\"> Welcome to the LoginID API docs. This documentation will help understand the API calls being made behind our SDKs.  These APIs can be used to manage authentication, users, and user credentials. </span>  # Authentication  <span class=\"subtext\"> There is one main form of authentication for the API: <br/>&bull; API Service Token </span> 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.loginid.sdk.java.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InlineResponse200AttestationPayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-10T08:30:05.952Z[GMT]")
public class InlineResponse200AttestationPayload {
  @SerializedName("credential_uuid")
  private String credentialUuid = null;

  @SerializedName("authenticatorSelection")
  private InlineResponse200AttestationPayloadAuthenticatorSelection authenticatorSelection = null;

  @SerializedName("challenge")
  private String challenge = null;

  @SerializedName("excludeCredentials")
  private List<String> excludeCredentials = null;

  @SerializedName("pubKeyCredParams")
  private List<InlineResponse200AttestationPayloadPubKeyCredParams> pubKeyCredParams = null;

  @SerializedName("rp")
  private InlineResponse200AttestationPayloadRp rp = null;

  @SerializedName("user")
  private InlineResponse200AttestationPayloadUser user = null;

  public InlineResponse200AttestationPayload credentialUuid(String credentialUuid) {
    this.credentialUuid = credentialUuid;
    return this;
  }

   /**
   * Get credentialUuid
   * @return credentialUuid
  **/
  @Schema(example = "b7bd9990-2c43-4dce-9286-93cccf81bc62", description = "")
  public String getCredentialUuid() {
    return credentialUuid;
  }

  public void setCredentialUuid(String credentialUuid) {
    this.credentialUuid = credentialUuid;
  }

  public InlineResponse200AttestationPayload authenticatorSelection(InlineResponse200AttestationPayloadAuthenticatorSelection authenticatorSelection) {
    this.authenticatorSelection = authenticatorSelection;
    return this;
  }

   /**
   * Get authenticatorSelection
   * @return authenticatorSelection
  **/
  @Schema(description = "")
  public InlineResponse200AttestationPayloadAuthenticatorSelection getAuthenticatorSelection() {
    return authenticatorSelection;
  }

  public void setAuthenticatorSelection(InlineResponse200AttestationPayloadAuthenticatorSelection authenticatorSelection) {
    this.authenticatorSelection = authenticatorSelection;
  }

  public InlineResponse200AttestationPayload challenge(String challenge) {
    this.challenge = challenge;
    return this;
  }

   /**
   * Get challenge
   * @return challenge
  **/
  @Schema(example = "pO9V4DruYKrXClSwUn9pRIapBfFcl_l0khQd7YwqQRE", description = "")
  public String getChallenge() {
    return challenge;
  }

  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }

  public InlineResponse200AttestationPayload excludeCredentials(List<String> excludeCredentials) {
    this.excludeCredentials = excludeCredentials;
    return this;
  }

  public InlineResponse200AttestationPayload addExcludeCredentialsItem(String excludeCredentialsItem) {
    if (this.excludeCredentials == null) {
      this.excludeCredentials = new ArrayList<String>();
    }
    this.excludeCredentials.add(excludeCredentialsItem);
    return this;
  }

   /**
   * Get excludeCredentials
   * @return excludeCredentials
  **/
  @Schema(description = "")
  public List<String> getExcludeCredentials() {
    return excludeCredentials;
  }

  public void setExcludeCredentials(List<String> excludeCredentials) {
    this.excludeCredentials = excludeCredentials;
  }

  public InlineResponse200AttestationPayload pubKeyCredParams(List<InlineResponse200AttestationPayloadPubKeyCredParams> pubKeyCredParams) {
    this.pubKeyCredParams = pubKeyCredParams;
    return this;
  }

  public InlineResponse200AttestationPayload addPubKeyCredParamsItem(InlineResponse200AttestationPayloadPubKeyCredParams pubKeyCredParamsItem) {
    if (this.pubKeyCredParams == null) {
      this.pubKeyCredParams = new ArrayList<InlineResponse200AttestationPayloadPubKeyCredParams>();
    }
    this.pubKeyCredParams.add(pubKeyCredParamsItem);
    return this;
  }

   /**
   * Get pubKeyCredParams
   * @return pubKeyCredParams
  **/
  @Schema(description = "")
  public List<InlineResponse200AttestationPayloadPubKeyCredParams> getPubKeyCredParams() {
    return pubKeyCredParams;
  }

  public void setPubKeyCredParams(List<InlineResponse200AttestationPayloadPubKeyCredParams> pubKeyCredParams) {
    this.pubKeyCredParams = pubKeyCredParams;
  }

  public InlineResponse200AttestationPayload rp(InlineResponse200AttestationPayloadRp rp) {
    this.rp = rp;
    return this;
  }

   /**
   * Get rp
   * @return rp
  **/
  @Schema(description = "")
  public InlineResponse200AttestationPayloadRp getRp() {
    return rp;
  }

  public void setRp(InlineResponse200AttestationPayloadRp rp) {
    this.rp = rp;
  }

  public InlineResponse200AttestationPayload user(InlineResponse200AttestationPayloadUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public InlineResponse200AttestationPayloadUser getUser() {
    return user;
  }

  public void setUser(InlineResponse200AttestationPayloadUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200AttestationPayload inlineResponse200AttestationPayload = (InlineResponse200AttestationPayload) o;
    return Objects.equals(this.credentialUuid, inlineResponse200AttestationPayload.credentialUuid) &&
        Objects.equals(this.authenticatorSelection, inlineResponse200AttestationPayload.authenticatorSelection) &&
        Objects.equals(this.challenge, inlineResponse200AttestationPayload.challenge) &&
        Objects.equals(this.excludeCredentials, inlineResponse200AttestationPayload.excludeCredentials) &&
        Objects.equals(this.pubKeyCredParams, inlineResponse200AttestationPayload.pubKeyCredParams) &&
        Objects.equals(this.rp, inlineResponse200AttestationPayload.rp) &&
        Objects.equals(this.user, inlineResponse200AttestationPayload.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialUuid, authenticatorSelection, challenge, excludeCredentials, pubKeyCredParams, rp, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200AttestationPayload {\n");

    sb.append("    credentialUuid: ").append(toIndentedString(credentialUuid)).append("\n");
    sb.append("    authenticatorSelection: ").append(toIndentedString(authenticatorSelection)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    excludeCredentials: ").append(toIndentedString(excludeCredentials)).append("\n");
    sb.append("    pubKeyCredParams: ").append(toIndentedString(pubKeyCredParams)).append("\n");
    sb.append("    rp: ").append(toIndentedString(rp)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

}
