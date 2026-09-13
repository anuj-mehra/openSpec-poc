#!/usr/bin/env bash
set -euo pipefail

git fetch origin --tags --force

latest_version=$(
  git tag --list '[0-9]*.[0-9]*.[0-9]*' --sort=-v:refname |
  head -n 1
)

if [ -z "$latest_version" ]; then
  echo "1.0.0"
  exit 0
fi

IFS='.' read -r major minor patch <<< "$latest_version"

patch=$((patch + 1))

echo "${major}.${minor}.${patch}"