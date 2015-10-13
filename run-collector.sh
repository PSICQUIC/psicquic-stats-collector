#!/usr/bin/env bash
mvn clean
mvn compile -Ppsicquic-stats
mvn exec:java -Dexec.mainClass=org.hupo.psi.mi.psicquic.stats.PsicquicStatsCollector
