# Java SDK for the TelePay API

![TelePay Python](https://github.com/TelePay-cash/telepay-java/blob/main/docs/cover.png?raw=true)

Official TelePay client library for the Python language, so you can easily process cryptocurrency payments using the REST API.

[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)
[![Last commit](https://img.shields.io/github/last-commit/telepay-cash/telepay-java.svg?style=flat-square)](https://github.com/telepay-cash/telepay-java/commits)
[![GitHub commit activity](https://img.shields.io/github/commit-activity/m/telepay-cash/telepay-java?style=flat-square)](https://github.com/telepay-cash/telepay-java/commits)
[![Github Stars](https://img.shields.io/github/stars/telepay-cash/telepay-java?style=flat-square&logo=github&)](https://github.com/telepay-cash/telepay-java/stargazers)
[![Github Forks](https://img.shields.io/github/forks/telepay-cash/telepay-java?style=flat-square&logo=github)](https://github.com/telepay-cash/telepay-php/network/members)
[![Github Watchers](https://img.shields.io/github/watchers/telepay-cash/telepay-java?style=flat-square&logo=github)](https://github.com/telepay-cash/telepay-java)
[![GitHub contributors](https://img.shields.io/github/contributors/telepay-cash/telepay-java?label=code%20contributors&style=flat-square)](https://github.com/telepay-cash/telepay-php/graphs/contributors)
[![Telegram](https://img.shields.io/badge/Telegram-2CA5E0?style=flat-squeare&logo=telegram&logoColor=white)](https://t.me/TelePayCash)
[![Blog](https://img.shields.io/badge/RSS-FFA500?style=flat-square&logo=rss&logoColor=white)](https://blog.telepay.cash)

## Installation

Coming soon (Installation with Maven or Graddle):
For now copy the .jar file and import it to your project

## Dependencies
The SDK has 2 dependencies of the libraries:
- java.net.http
- org.json

## Using the library

**Configure the TelePay client using the secret of your merchant**
```java
Merchant merchant = new Merchant(YOUR_SECRET_KEY);
TelepayClient client = new TelepayClient(merchant);
```

**Get your current merchant** [Read docs](https://telepay.readme.io/reference/getme)
```java
JSONObject me = client.getMe();
System.out.println(me);
```

**Get your balance** [Read docs](https://telepay.readme.io/reference/getbalance)
```java
JSONObject balance = client.getBalance();
System.out.println(balance);
```

**Get the assets**
Get assets supported by TelePay. [Read docs](https://telepay.readme.io/reference/getassets)
```java
JSONObject assets = client.getAssets();
System.out.println(assets);
```

**Get invoices**
Get the merchant's invoices. [Read docs](https://telepay.readme.io/reference/getinvoices)
```java
JSONObject invoices = client.getInvoices();
System.out.println(invoices);
```

**Get invoice**
You can also get a single invoice in particular by invoice number [Read docs](https://telepay.readme.io/reference/getWebhooks)
```java
String invoiceNumber = "75";
JSONObject invoice = client.getInvoice();
System.out.println(invoice);
```

**Get webhooks**
Get the merchant's webhooks. [Read docs](https://telepay.readme.io/reference/getinvoices)
```java
JSONObject webhooks = client.getWebhooks();
System.out.println(webhook);
```

**Get webhook**
You can also get a single webhook in particular and its details passing the Webhook ID [Read docs](https://telepay.readme.io/reference/getWebhook)
```java
String webhookId = "T45A7810";
JSONObject invoice = client.getWebhook(webhookId);
System.out.println(invoice);
```

**Get balance**
Get the balance of an specific asset of the merchant [Read docs](https://telepay.readme.io/reference/getBalance)
```java
String asset = "TON";
String blockchain = "TON";
String network = "mainnet";
JSONObject balance = client.getBalance(asset, blockchain, network);
System.out.println(balance);
```

**Create Invoice**
Create an new invoice with an specified amount [Read docs](https://telepay.readme.io/reference/createInvoice)
```java
String asset = "TON";
String blockchain = "TON";
String network = "mainnet";
double amount = 10;
JSONObject invoice = client.createInvoice(asset, blockchain, network, amount);
System.out.println(invoice);
```

**Delete Invoice**
Delete an invoice [Read docs](https://telepay.readme.io/reference/deleteInvoice)
```java
String invoiceNumber
JSONObject delete = client.deleteInvoice(invoiceNumber);
System.out.println(delete);
```

**Cancel Invoice**
Cancel an invoice [Read docs](https://telepay.readme.io/reference/cancelInvoice)
```java
String invoiceNumber
JSONObject cancel = client.cancelInvoice(invoiceNumber);
System.out.println(delete);
```

**Transfer**
Transfer funds between wallets [Read docs](https://telepay.readme.io/reference/transfer)
```java
String asset = "TON";
String blockchain = "TON";
String network = "mainnet";
double amount = 10;
String username = "jrgf"
JSONObject transfer = client.transfer(asset, blockchain, network, amount, transfer);
System.out.println(transfer);
```

## Contributors ✨
<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://www.linkedin.com/in/josé-r-garcía-88a793221/"><img src="https://avatars.githubusercontent.com/jrgf" width="100px;" alt=""/><br /><sub><b>José Rafael García</b></sub></a><br /><a href="https://github.com/TelePay-cash/telepay-php/commits?author=jrgf" title="Code">💻</a></td>
    <td align="center"><a href="https://carloslugones.com"><img src="https://avatars.githubusercontent.com/u/18733370?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Carlos Lugones</b></sub></a><br /><a href="https://github.com/telepay-cash/telepay-node/commits?author=CarlosLugones" title="Mentoring">🧑‍🏫</a></td>
  </tr>
</table>
<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
