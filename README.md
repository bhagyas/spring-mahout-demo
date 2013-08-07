spring-mahout-demo
==================

This is a sample java web application that demonstrates the integration of Apache Mahout with a database driven Spring based application to provide intelligent shopping recommendations.

How to run
----
1. Checkout the project from github or download the source as an archive.

1. Execute `mvn tomcat:run` command on the project root.

1. Navigate to `http://localhost:8080/ShopRecommender` on your browser.

Adding Data
---
You can use the generated user interface to add/edit data.

**Adding items and shoppers**
* Add items by visiting `http://localhost:8080/ShopRecommender/items?form`
* Add shoppers by visiting `http://localhost:8080/ShopRecommender/shoppers?form`

**Adding purchase information**
* Create purchases for users and items by visiting `http://localhost:8080/ShopRecommender/purchases?form`.

Viewing Recommendations
----
To view the recommendations for a shopper, visit the profile for a shopper by selecting a shopper from `http://localhost:8080/ShopRecommender/shoppers` 

Updates
-----
**7 August 2013** 

* Initial project available on github

Support or Contact
----
If you discover any issues, please report them over at github - or simply fork the project, fix it and then do a pull request. =)

Interesting projects
---
Also have a look at roostrap by @bhagyas, available at http://bhagyas.github.io/roostrap : a free and open source rapid application framework that enables you to build gorgeous cloud ready java applications in minutes!

Authors
---
* Bhagya Nirmaan Silva (www.about.me/bhagyas)

With love.
<3
