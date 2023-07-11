IMPORTANT

AFTER YOU DOWNLOAD THE JAVAFX SDK MAKE SURE TO ADD THE LIBRARIES TO YOUR IDE ALSO IF YOU ARE USING VSCODE TO ADD THE SDK GO TO RUN
ADD CONFIGURATION 
AND MAKE SURE IT HAS A FORMAT SIMILAR TO THIS
{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Main",
            "request": "launch",
            "mainClass": "Main",
            "projectName": "VS code java1_a7611f36"
        },
        {
            "type": "java",
            "name": "Current File",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "App",
            "request": "launch",
            "mainClass": "App",
            "projectName": "VS code java1_a7611f36",
            "vmArgs": "--module-path \"M:\\Apps\\javafx-sdk-20.0.1\\lib\" --add-modules javafx.controls,javafx.fxml"
        }
    ]
}
