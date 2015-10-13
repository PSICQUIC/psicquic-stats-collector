#!/usr/bin/env bash
#mvn install -Pcollect-stats -Dpsicquic.registry.url="http://www.ebi.ac.uk/Tools/webservices/psicquic/registry/registry?action=ACTIVE&format=txt&restricted=n"
mvn test exec:java -Dexec.mainClass=org.hupo.psi.mi.psicquic.stats.PsicquicStatsCollector -Ppsicquic-stats
