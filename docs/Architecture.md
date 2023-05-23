# Architecture Design V0.1

![Arch Design version 0.1](./Alpha%20Arch%200.1.png "Arch Design version 0.1")

## MidWare & Versions
| MidWare | Version       |
|---------|---------------|
| Mysql   | 8.0.32        |
| Redis   | 7.2-rc-alpine |
| Kafka   | 3.4           |

## Component & Version
| Component            | Version  |
|----------------------|----------|
| Spring Boot          | 3.0.2    |
| Spring Cloud Alibaba | 2022.0.0 |
| Nacos                | 2.2.2    |

For the purpose of version 0.1, I'm going to build a basic arch for this platform,
all the components and mid-wares will be work together. 
The target is to make this platform runnable, but no matter about the performance.

All the Midware will be deployed by docker on dev env.