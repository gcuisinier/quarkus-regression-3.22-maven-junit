package net.gcuisinier.quarkus;

import io.quarkus.test.junit.QuarkusTestProfile;
import org.eclipse.microprofile.config.ConfigProvider;

import java.util.Map;

public class TestProfile implements QuarkusTestProfile {

    @Override
    public Map<String, String> getConfigOverrides() {

        ConfigProvider.getConfig(Thread.currentThread().getContextClassLoader()).getPropertyNames().forEach(System.out::println);

        return QuarkusTestProfile.super.getConfigOverrides();
    }
}
