
# Проект мобильной автоматизации для приложения  [Пыльца Club](https://pollen.club//)

<p align="center">
<img title="PollenClub" src="images/logo/PollenClubLogo.jpg" width="450"/>

</p>

## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#browserstack">Сборка в Browserstack</a>

* <a href="#video">Пример видео прогона автотеста</a>
____

<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://www.browserstack.com/"><img src="images/logo/Browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://developer.android.com/studio"><img src="images/logo/android-studio-1.svg" width="50" height="50"  alt="Android-Studio"/></a> 
<a href="https://appium.io/docs/en/2.0/"><img src="images/logo/appium.png" width="50" height="50"  alt="Appium"/></a> 
<a href="https://appium.io/docs/en/2.0/"><img src="images/logo/appium2.png" width="50" height="50"  alt="Appium"/></a> 
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

____
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____
- ✓ *Проверка, что во вкладке "Аллерго прогноз" есть аллерген "Ольха"*
- ✓ *Наличие обозначений на странице "Карта рисков"*
- ✓ *Проверка, что в списке симптомов есть определенный симптом*
- ✓ *Проверка возможности выбора схемы терапии*
- ✓ *Проверка описания во вкладке "Фенология"*

____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_final_mobile/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_final_mobile/"><img src="images/screen/jenkins_build.png" alt="Jenkins" width="950"/></a>  
</p>

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean test -DdeviceHost=${DEVICEHOST}
```

***Удалённый запуск через Jenkins:***
```bash  
clean test -DdeviceHost=${DEVICEHOST}

```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_final_mobile/allure/)</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/jenkins_dashboard.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/jenkins_tests.png" width="850">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screen/jenkins_graphs.png" width="850">
</p>

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/2817/dashboards">Allure TestOps</a>
____
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/allure_dashboard.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screen/allure_tests.png" width="850">  
</p>

___
<a id="jira"></a>
## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-744">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screen/jira.png" width=850"">  
</p>

____
<a id="browserstack"></a>
## <img alt="Browserstack" height="25" src="images/logo/Browserstack.svg" width="25"/></a> Сборка в Browserstack
____
<p align="center">  
<img title="BrowserstackDashboard" src="images/screen/browserstack_build.png" width="850">  
</p>

____
<a id="video"></a>
## <img alt="Browserstack" height="25" src="images/logo/Browserstack.svg" width="25"/></a> Примеры видео выполнения тестов
____
<p align="center">
<img title="Browserstack Video" src="images/gifs/video-5fa0addfdf3628a88a821c4026559175ecb5dce2.gif" width="600"  alt="video">   
</p>

