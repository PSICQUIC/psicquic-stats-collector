#!/bin/bash

#SBATCH --time=06-00:00:00   # walltime
#SBATCH --ntasks=1   # number of tasks
#SBATCH --cpus-per-task=5   # number of CPUs Per Task i.e if your code is multi-threaded
#SBATCH --nodes=1   # number of nodes
#SBATCH -p production   # partition(s)
#SBATCH --mem=16G   # memory per node
#SBATCH -J "IMEX_STATS"   # job name
#SBATCH -o "/nfs/production/hhe/intact/data/psicquic-stats-logs/run-imex-collector-%j.out"   # job output file
#SBATCH --mail-user=intact-dev@ebi.ac.uk   # email address
#SBATCH --mail-type=ALL

mvn compile -Ppsicquic-stats-imex
mvn exec:java -Dexec.mainClass=org.hupo.psi.mi.psicquic.stats.PsicquicStatsCollector -Ppsicquic-stats-imex

