<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Amazon_singp_Excle_TestSuite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>a23d3134-1aa8-49c2-9368-9453f414e5db</testSuiteGuid>
   <testCaseLink>
      <guid>b83dbe6f-be7f-47dd-9195-81800d4b7996</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>'keylogertest7@gmail.com'</defaultValue>
         <description>userid for new register</description>
         <id>5ce7bd9d-a291-4bd7-a34a-f8dc1613ee4c</id>
         <masked>false</masked>
         <name>userId</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/Amazon_SignUp_TC_001</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b4b95a4c-b788-4184-8716-a71ce77fc479</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/AmazonData/Amazon_signup_testData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>b4b95a4c-b788-4184-8716-a71ce77fc479</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Email ID</value>
         <variableId>5ce7bd9d-a291-4bd7-a34a-f8dc1613ee4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b4b95a4c-b788-4184-8716-a71ce77fc479</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>f27a622d-589b-4ccd-8c1c-25eb01076398</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b4b95a4c-b788-4184-8716-a71ce77fc479</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Re-enter Password</value>
         <variableId>1f4a7aa9-f53b-4adb-a96d-1d3175818a5f</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
