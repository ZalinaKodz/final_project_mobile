package configs;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")

public interface BrowserstackConfig extends Config {

        @Key("browserstack.user")
        @DefaultValue("valeryakodz_SgmBq0")
        String getUser();

        @Key("browserstack.key")
        @DefaultValue("Bq2zxjeJqfKEmfwq8MND")
        String getKey();

        @Key("remoteUrl")
        @DefaultValue("https://hub.browserstack.com/wd/hub")
        String getRemoteUrl();

        @Key("app")
        @DefaultValue("bs://d594907af383036336257498402a30c94362c75a")
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
