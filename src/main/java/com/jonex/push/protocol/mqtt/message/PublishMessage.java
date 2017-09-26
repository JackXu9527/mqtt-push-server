package com.jonex.push.protocol.mqtt.message;

import io.netty.buffer.ByteBuf;

/**
 * MQTT协议Publish消息类型实现类，发布消息的消息类型
 * 
 * @Author jonex [r13ljj@gmail.com]
 * @Date 2017/9/26 11:38
 */
public class PublishMessage extends Message {

	public PublishMessage(FixedHeader fixedHeader, PublishVariableHeader variableHeader,
			ByteBuf payload) {
		super(fixedHeader, variableHeader, payload);
	}
	
	@Override
	public PublishVariableHeader getVariableHeader() {
		return (PublishVariableHeader)super.getVariableHeader();
	}
	
	@Override
	public ByteBuf getPayload() {
		return (ByteBuf)super.getPayload();
	}

}
