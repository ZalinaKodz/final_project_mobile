package configs;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/emulator.properties")
public interface EmulatorConfig extends Config {
    @Key("appPackage")
    @DefaultValue("pollen.sgolovanov.pollen2")
    String appPackage();

    @Key("appActivity")
    @DefaultValue("pollen.sgolovanov.pollen2.MainActivity")
    String appActivity();

    @Key("serverUrl")
    @DefaultValue("http://localhost:4723/wd/hub")
    String serverUrl();

    @Key("appPath")
    @DefaultValue("src/test/resources/app/pollen.sgolovanov.pollen2.apk")
    String appPath();

    @Key("deviceName")
    @DefaultValue("Pixel 4 API 30")
    String deviceName();

    @Key("platformVersion")
    @DefaultValue("11.0")
    String platformVersion();

}
