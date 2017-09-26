package com.jonex.push.protocol.mqtt.message;

/**
 * Mqtt协议总共有十四种类型
 * Reserved	0	禁止	保留
 * CONNECT	1	客户端到服务端	客户端请求连接服务端
 * CONNACK	2	服务端到客户端	连接报文确认
 * PUBLISH	3	两个方向都允许	发布消息
 * PUBACK	4	两个方向都允许	QoS 1消息发布收到确认
 * PUBREC	5	两个方向都允许	发布收到（保证交付第一步）
 * PUBREL	6	两个方向都允许	发布释放（保证交付第二步）
 * PUBCOMP	7	两个方向都允许	QoS 2消息发布完成（保证交互第三步）
 * SUBSCRIBE    8	客户端到服务端	客户端订阅请求
 * SUBACK	9	服务端到客户端	订阅请求报文确认
 * UNSUBSCRIBE	10	客户端到服务端	客户端取消订阅请求
 * UNSUBACK	11	服务端到客户端	取消订阅报文确认
 * PINGREQ	12	客户端到服务端	心跳请求
 * PINGRESP	13	服务端到客户端	心跳响应
 * DISCONNECT	14	客户端到服务端	客户端断开连接
 * Reserved	15	禁止	保留
 *
 * @Author jonex [r13ljj@gmail.com]
 * @Date 2017/9/26 13:51
 */
public enum MessageType {
    CONNECT(1),
    CONNACK(2),
    PUBLISH(3),
    PUBACK(4),
    PUBREC(5),
    PUBREL(6),
    PUBCOMP(7),
    SUBSCRIBE(8),
    SUBACK(9),
    UNSUBSCRIBE(10),
    UNSUBACK(11),
    PINGREQ(12),
    PINGRESP(13),
    DISCONNECT(14);

    private final int value;

    private MessageType(int value){
        this.value = value;
    }

    public int value(){
        return value;
    }

    public static MessageType valueOf(int type){
        for (MessageType t : values()) {
            if (t.value() == type){
                return t;
            }
        }
        throw new IllegalArgumentException("未知的MQTT协议类型："+type);
    }
}
