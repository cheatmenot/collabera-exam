### Design
* ControllerAdvice `com.eycads.collaberaexam.controller.ControllerAdvice` who would catch exception thrown
* Controller would hold the endpoint
* Mapper would map from `AccountingLingXYZ` to `AccountingLine`

### Unit Testing
Controller Test `com.eycads.collaberaexam.controller.AccountingControllerTest`
Service Test `com.eycads.collaberaexam.service.AccountingServiceTest`
Mapper Test `com.eycads.collaberaexam.mapper.AccountingMapperTest`

### Testing
API URL
```shell
POST http://localhost:8081/api/v1/accounting

Request:
<AccountingLine id="572" index="1" op="C" elementId="PNR-572">
    <TypeIndicator>TYPE-01</TypeIndicator>
    <FareApplication>ONE</FareApplication>
    <FormOfPaymentCode>FormOfPaymentCode0</FormOfPaymentCode>
    <LinkCode>01</LinkCode>
    <AccountingVendorCode>ABC</AccountingVendorCode>
    <ChargeCategoryCoded>TEST</ChargeCategoryCoded>
    <AirlineDesignator>AA</AirlineDesignator>
    <DocumentNumber>3889081143</DocumentNumber>
    <CommissionPercentage>2</CommissionPercentage>
    <CommissionAmount>2</CommissionAmount>
    <BaseFare>1252.31</BaseFare>
    <TaxPercentage>1</TaxPercentage>
    <TaxAmount>201.38</TaxAmount>
    <TaxSurchargeCode2>VAT</TaxSurchargeCode2>
    <GSTCode>GST</GSTCode>
    <GSTAmount>10</GSTAmount>
    <GSTPercent>1</GSTPercent>
    <QSTCode>QST</QSTCode>
    <QSTAmount>10</QSTAmount>
    <QSTPercent>1</QSTPercent>
    <CreditCardNumber>123456789</CreditCardNumber>
    <CreditCardCode>AX0</CreditCardCode>
    <PassengerName>Thanos</PassengerName>
    <NumberOfConjunctedDocuments>15-FEE-EXP$08</NumberOfConjunctedDocuments>
    <NumberOfCoupons>1</NumberOfCoupons>
    <OriginalTicketNumber>123456</OriginalTicketNumber>
    <OriginalDateOfIssue>2021-01-28</OriginalDateOfIssue>
    <OriginalPlaceOfIssue>MNL</OriginalPlaceOfIssue>
    <FullPartialExchangeIndicator>PART</FullPartialExchangeIndicator>
    <OriginalInvoice>00001</OriginalInvoice>
    <TarriffBasis>TarriffBasis0</TarriffBasis>
    <FreeFormText>HELLO WORLD</FreeFormText>
    <CurrencyCode>USD</CurrencyCode>
    <SegmentType>AIR</SegmentType>
    <SegmentNumber>1,2,3</SegmentNumber>
</AccountingLine>

Response:
{
    "accountingLineID": "572",
    "accountingLineStatus": "ACTIVE",
    "accountingVendorCode": "ABC",
    "airlineCode": null,
    "chargeCategoryCode": "TEST",
    "formattedReceiptNumber": null,
    "invoiceNumber": "00001",
    "linkCode": "01",
    "numberOfConjunctedDocuments": "15-FEE-EXP$08",
    "originalTicketNumber": "123456",
    "receiptNumber": "3889081143",
    "segmentRefIDList": [
        "1",
        "2",
        "3"
    ],
    "travelerName": "Thanos",
    "travelerRefIDList": [
        "1"
    ],
    "typeIndicator": "TYPE-01",
    "elementNumber": "1",
    "fareApplication": "ONE",
    "baseFare": {
        "formattedValue": "1252.31",
        "currencyCode": "USD",
        "value": 1252.31,
        "numberOfDecimals": 2
    },
    "taxAmount": {
        "formattedValue": "201.38",
        "currencyCode": "USD",
        "value": 201.38,
        "numberOfDecimals": 2
    },
    "totalTaxAmount": {
        "formattedValue": "221.38",
        "currencyCode": "USD",
        "value": 221.38,
        "numberOfDecimals": 2
    },
    "totalTaxSurcharge": {
        "formattedValue": "20.0",
        "currencyCode": "USD",
        "value": 20.0,
        "numberOfDecimals": 1
    },
    "gstAmount": {
        "formattedValue": "10",
        "currencyCode": "USD",
        "value": 10.0,
        "numberOfDecimals": 0
    },
    "gstCode": "GST",
    "qstAmount": {
        "formattedValue": "10",
        "currencyCode": "USD",
        "value": 10.0,
        "numberOfDecimals": 0
    },
    "qstCode": "QST",
    "commission": {
        "code": null,
        "amount": {
            "formattedValue": "2",
            "currencyCode": "USD",
            "value": 2.0,
            "numberOfDecimals": 0
        },
        "percentage": 2
    },
    "freeFormText": "HELLO WORLD"
}
```


