# [ARCHIVE] ContactLimiter

In order to prevent a DDOS via many attempts to execute `contact.php`, the script only sends the contact message if a recorded amount of sends is a low amount. Therefore, if the value was high, it can be assumed that many contacts were sent by either many people or a DDOS attack. Taking the latter, we can limit the amount of contacts sent on [www.npwd.tech/contact](www.npwd.tech/contact).

ContactLimiter is part of this system. It resets the amount of contacts to 0 every 3 days to allow for contacts. Meaning, in the case that many people did contact, there would be more contacts available in 3 days at any time.

ContactLimiter was a utility for this purpose that was kept running on the web server that hosted [www.npwd.tech](www.npwd.tech), when it was running.

 ## **Author**
Nathan Weber

**GitHub** [@npweber](https://github.com/npweber/)

***Many thanks!***


