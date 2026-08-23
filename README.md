# Steps to install openspec
## Install nodejs

## Install Openspec

## Initialize openspec in the project
cd /Users/anujmehra/git/openSpec-poc/
openspec init






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

