package configs;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")

public interface BrowserstackConfig extends Config {

        @Key("browserstack.user")
        @DefaultValue("zalinak_18sIpW")
        String getUser();

        @Key("browserstack.key")
        @DefaultValue("wZvcJoW5ETMyPJXmPvu5")
        String getKey();

        @Key("remoteUrl")
        @DefaultValue("https://hub.browserstack.com/wd/hub")
        String getRemoteUrl();

        @Key("app")
        @DefaultValue("bs://662af8fdb13f871b3b7a488ba0f8fe34622b032c")
        String getApp();

        @Key("device")
        @DefaultValue("Google Pixel 3")
        String getDevice();

        @Key("os_version")
        @DefaultValue("9.0")
        String getOsVersion();

        @Key("project")
        @DefaultValue("First Java Project")
        String getProjectName();

        @Key("build")
        @DefaultValue("browserstack-build-1")
        String getBuildName();

        @Key("name")
        @DefaultValue("mobile_test")
        String getTestName();
}
