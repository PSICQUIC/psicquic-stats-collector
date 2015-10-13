#!/usr/bin/env bash
mvn test exec:java -Dexec.mainClass=org.hupo.psi.mi.psicquic.stats.PsicquicStatsCollector -Ppsicquic-stats-imex

