# Steps to install openspec
## Install nodejs

## Install Openspec

## Initialize openspec in the project
cd /Users/anujmehra/git/openSpec-poc/
openspec init

This step will add following;
    .github\agents
    .github\workflows
    .github\workflows\copilot-setup-steps.yml
    .github\skills
    .github\prompts


## do git push




## OpenSpec contains two folders;
1. \openspec\changes\ => for the proposed updates
2. \openspec\specs\   => for the current truth

These two folders keep state and diffs different.

## Following commands helped in create a Java 25 + SprintBoot 4.1.1 project


-----------------------------------------------------------------------------
specs/       → defines WHAT to generate
skills/      → defines HOW to generate
actions/     → automates WHEN to generate

Project Structure: Generated using Specs and skills
dataflow-project/
│
├── specs/
│   ├── pipeline.yaml
│   ├── ingestion.yaml
│   ├── join.yaml
│   ├── ytd.yaml
│   ├── accounting.yaml
│
├── skills/
│   ├── beam_pipeline.yaml
│   ├── beam_transform.yaml
│   ├── gcs_io.yaml
│   ├── bigquery_io.yaml
│
├── src/main/java/com/project/
│   ├── pipeline/
│   ├── transforms/
│   ├── models/
│   ├── options/
│
├── scripts/
├── pom.xml
└── README.md

