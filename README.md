# 📱 Mobile Calculator Automation Test

This project demonstrates automated testing of a mobile Calculator application on an Android device using **Appium**, **Java**, and **Selenium WebDriver**. 
The main goal is to simulate user interaction with the calculator app to verify the correctness of basic arithmetic operations—in this case, a simple addition (`8 + 2 = 10`). 

Mobile app automation helps in validating the functionality, stability, and reliability of applications without manual intervention. 
This example is particularly useful for QA engineers, testers, and developers looking to get started with mobile test automation using real devices and APK files.

The test initializes an Appium session, installs the Calculator APK on a real Android device, performs the calculation, and validates the result programmatically.

---

## Tools & Technologies

- Java
- Appium
- Selenium WebDriver
- AndroidDriver (Appium)
- Real Android Device
- Calculator APK (`Calculator_15.0.15_Apkpure.apk`)


## Example : Test Case 

**Test Name:** Addition Operation Validation  
**Steps:**
1. Launch Calculator App
2. Click on `8`
3. Click on `+`
4. Click on `2`
5. Click on `=`
6. Validate the result is `10`

---

## 🔧 Setup Instructions

1. Install Java JDK
2. Install Android Studio (with SDK & ADB)
3. Install Node.js and Appium:
   ```bash
   npm install -g appium
