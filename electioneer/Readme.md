#Context

This application serves as the backend for digital voting machines. 
Voting using this software consists of 2 main steps:
##### 1. Password validation
Using the passportController, the software receives all data of a citizen's passport and check a number of factors such as the hologram, personal data and passport id. If any of these checks fail, an error is thrown and the person will be unable to register his vote.

##### 2. Performing the vote
A person can vote on federal, regional or local level. A person chooses a party and a member of that party's list.
Next to this data, the id of the voting machine is also provided.

For regional and local levels, the system checks if the chosen party/member is registered to the region/municipality where the voting machine is located. 
This is achieved by looking up the voting machine's data using its id and cross-referencing it with the location data of the chosen party/member.

The voting machine only knows its x/y coordinates, however. To convert these to an municipality/region, we use an external geoservice.

### Other features
Voting machines need to provide their UIs in multiple languages. For that reason the TranslationController can be consulted to request the translations of a certain (list of) word(s) for a given language. These translations are bundled in translation properties files.

#Exercise

You are tasked with modernizing the backend code.

*You can ignore the 'validator-settings.properties' file for now. It will be used in exercise 2.

*Some of the passport validators are not used. Please do not delete them. They will also come into play in exercise 2.

###1. Agalev
Convert the code into Java 9 modules. Given the knowledge you have so far, try to find some functional blocks to put into separate components. Make sure only the essential classes are exposed. (Tip: you can always mess around using the Application class' Main method).

###2. B.U.B.
The passport validation is so complex that it has been decided that this part will be developed by a separate team.
Some agreements your team made with the Validation team:
- The passport validation has to be in a separate module.
- This module contains a great number of validators that will only grow in the future. 
A large number of applications will consume this module and every consumer will need its own subset of validators. 
It is up to the consumers to figure out which validators they need. The validator team has agreed to put every validator in a separate package and export these packages separately. 
- The validator team will also provide a 'validator-settings' file that contains the properties needed to use their service. 
Make sure you can read this property file that is located in the validator module from the 'main' module.

###3. CD&V

Due to GDPR, the translations resource bundles will have to be stored in a separate module from the controller.

###4. DeDecker

The translations module has been split into 'api' and 'implementation'. 
The implementation module is managed by a new team, but they sometimes forget to export anything.
Provide a backup implementation in case the official one is not found.

###5. Ecolo

Any interesting topics from ch 3-4-5 that haven't been handled yet? Feel free to create your own exercise!