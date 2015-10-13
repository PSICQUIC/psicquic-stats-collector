#!/usr/bin/env bash
mvn compile -Ppsicquic-stats
mvn exec:java -Dexec.mainClass=org.hupo.psi.mi.psicquic.stats.PsicquicStatsCollector
