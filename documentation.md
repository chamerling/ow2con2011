---
layout: layout
title: "@chamerling - OW2Con 2011 - Documentation"
---


# Documentation
## Modules

- [Petals DSB](http://research.petalslink.org/display/petalsdsb/) : Distributed Service Bus
- [Petals Master](http://master.ow2.org) 1.0 : Governance Tool
- [Petals BPM](http://research.petalslink.org/display/petalsbpm/) : SaaS Business Process Editor
- [DSB Manager](https://github.com/chamerling/dsbmanager-webapp) : SaaS Monitoring and Management Console for Petals DSB
- Some external SOAP Web services

## Architecture
> Need to draw something...

## Scenario
> In the demo, we are going to create a BPM process in the Petals BPM process editor and then deploy it on a service oriented environment provided by Petals DSB. In order to achieve this, we use the Petals Master Governance solution, which can be seen as an advanced service registry, to search and use services at design time. These services are not just simple artefacts but real services connected to the service bus. The process itself is then deployed on a runtime engine and exposed as a service by the bus.

> In the better case, we will be able to run the process and monitor it with the DSB management console ;)

### Let's do it with some slides...
**TODO**

### Where is the Cloud?

Can't you see it? Right I talked about Cloud in the abstract and you can easily imagine where and what we can put in the Cloud: Services, Web application at the SaaS level, the DSB at the PaaS level. But where is the IaaS? For now there is nothing (yeah in fact many things in my mind), but it is an ongoing work. We started to think and implement some prototypes on top of the most popular open source IaaS layers (OpenNebula and OpenStack in fact). As I explained severall times in several places, this is really important in the DSB approach to base it on a IaaS layer in order to benefit of the Cloud features such as elasticity and migration for example. But in order to create elastic SOA, we need to add some features to the Service Bus, especially on its dynamic distributed mode where anything can scale up and down automatically and where web services can migrate from node to node easily...

## Howtos & Downloads
### Prerequisiteries
Petals DSB is a middleware so even if you can do many things with it, using it requires configuration and management tools. The current version of the DSB is almost preconfigured. Please follow the instructions to be able to use it correctly.

It is assumed that you have a Tomcat Web application container or equivalent installed on your host.

### Petals Master

1. Petals Master 1.0 is available at [https://github.com/downloads/chamerling/ow2con2011/petals-master-1.0.zip](https://github.com/downloads/chamerling/ow2con2011/petals-master-1.0.zip)
2. Once downloaded, unzip and launch the *start.sh* script
3. Master is available at [http://localhost:8323/petals-master-1.0/](http://localhost:8323/petals-master-1.0/).
4. Connect with login = *master* and password = *master*

### Petals DSB

1. Petals DSB is available at [http://research.petalslink.org/display/petalsdsb/](http://research.petalslink.org/display/petalsdsb/ "PetalsDSB Overview - PetalsDSB - Petalslink Research")
2. Once downloaded, unzip, go to *bin* folder and launch the *startup.sh -C* script.

### Petals BPM

1. Petals BPM is available for download at  [https://github.com/downloads/chamerling/ow2con2011/](https://github.com/downloads/chamerling/ow2con2011/).
2. You must deploy it in the Web application container. Once deployed, access to Petals BPM at [http://localhost:8080/petalsbpm](http://localhost:8080/dsb-bpmn-deployer-client-1.0-SNAPSHOT/).

### DSB Manager
The DSB Manager is a Play! powered application. Follow the application instructions at [https://github.com/chamerling/dsbmanager-webapp](https://github.com/chamerling/dsbmanager-webapp) to clone it and start it. Once started, the DSB Management application is available at [http://localhost:9000/](http://localhost:9002/).

## Some Useful URLs

- Petals Master URL : [http://localhost:8323/petals-master-1.0/](http://localhost:8323/petals-master-1.0/)
- Petals Master connection service : 
- Petals BPM : [http://localhost:8080/dsb-bpmn-deployer-client-1.0-SNAPSHOT/](http://localhost:8080/dsb-bpmn-deployer-client-1.0-SNAPSHOT/)
- Petals DSB Master Connection service: [http://localhost:7600/petals/ws/MasterConnectionService](http://localhost:7600/petals/ws/MasterConnectionService)
- Petals DSB deployment URL (to be used in Petals BPM) : [http://localhost:7600/petals/ws](http://localhost:7600/petals/ws)
- Petals DSB kernel management URL : [http://localhost:7600/petals/ws/](http://localhost:7600/petals/ws/)
- Petals DSB SOAP binding : [http://localhost:8084](http://localhost:8084)
