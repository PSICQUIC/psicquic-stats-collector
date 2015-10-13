#!/usr/bin/env bash
mvn compile -Ppsicquic-stats-imex
mvn exec:java -Dexec.mainClass=org.hupo.psi.mi.psicquic.stats.PsicquicStatsCollector -Ppsicquic-stats-imex

