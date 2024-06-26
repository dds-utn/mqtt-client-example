package ar.dds.utn.frba.mqttclient.example;

import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MyCustomMessageReceptor implements IMqttMessageListener {

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        System.out.println("Message recived from topic " + topic + ": " + mqttMessage.toString());
    }
}
