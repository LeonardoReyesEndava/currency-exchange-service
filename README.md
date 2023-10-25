Currency Exchange Service leverages the Spring Registration and Discovery in order to introduce service discovery using [Netflix - Eureka library](https://github.com/spring-cloud/spring-cloud-netflix).

## High Level Diagram
Below is a high level on how the services will be registered to the naming-server.

![High Level Diagram](./docs/diagrams/ExchangeService.png)

### Server URL
This service will run under 8000 port by default: http://localhost:8000

### Consuming the API
http://localhost:INSTANCE-PORT/currency-exchange/from/USD/to/INR

