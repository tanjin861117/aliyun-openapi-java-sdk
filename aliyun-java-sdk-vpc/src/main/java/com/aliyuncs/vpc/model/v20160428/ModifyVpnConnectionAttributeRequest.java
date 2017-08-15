/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyVpnConnectionAttributeRequest extends RpcAcsRequest<ModifyVpnConnectionAttributeResponse> {
	
	public ModifyVpnConnectionAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyVpnConnectionAttribute", "vpc");
	}

	private String ikeConfig;

	private Long resourceOwnerId;

	private String remoteSubnet;

	private Boolean effectImmediately;

	private String resourceOwnerAccount;

	private String clientToken;

	private String ownerAccount;

	private String ipsecConfig;

	private Long ownerId;

	private String localSubnet;

	private String vpnConnectionId;

	private String name;

	public String getIkeConfig() {
		return this.ikeConfig;
	}

	public void setIkeConfig(String ikeConfig) {
		this.ikeConfig = ikeConfig;
		if(ikeConfig != null){
			putQueryParameter("IkeConfig", ikeConfig);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRemoteSubnet() {
		return this.remoteSubnet;
	}

	public void setRemoteSubnet(String remoteSubnet) {
		this.remoteSubnet = remoteSubnet;
		if(remoteSubnet != null){
			putQueryParameter("RemoteSubnet", remoteSubnet);
		}
	}

	public Boolean getEffectImmediately() {
		return this.effectImmediately;
	}

	public void setEffectImmediately(Boolean effectImmediately) {
		this.effectImmediately = effectImmediately;
		if(effectImmediately != null){
			putQueryParameter("EffectImmediately", effectImmediately.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getIpsecConfig() {
		return this.ipsecConfig;
	}

	public void setIpsecConfig(String ipsecConfig) {
		this.ipsecConfig = ipsecConfig;
		if(ipsecConfig != null){
			putQueryParameter("IpsecConfig", ipsecConfig);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getLocalSubnet() {
		return this.localSubnet;
	}

	public void setLocalSubnet(String localSubnet) {
		this.localSubnet = localSubnet;
		if(localSubnet != null){
			putQueryParameter("LocalSubnet", localSubnet);
		}
	}

	public String getVpnConnectionId() {
		return this.vpnConnectionId;
	}

	public void setVpnConnectionId(String vpnConnectionId) {
		this.vpnConnectionId = vpnConnectionId;
		if(vpnConnectionId != null){
			putQueryParameter("VpnConnectionId", vpnConnectionId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<ModifyVpnConnectionAttributeResponse> getResponseClass() {
		return ModifyVpnConnectionAttributeResponse.class;
	}

}