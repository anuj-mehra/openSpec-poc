#!/usr/bin/env bash
set -euo pipefail

git fetch --tags --force >/dev/null 2>&1 || true

latest_version=$(git tag --list '[0-9]*.[0-9]*.[0-9]*' --sort=-v:refname | head -n 1 || true)

if [ -z "${latest_version}" ]; then
  echo "1.0.0"
  exit 0
fi

version_no_prefix="${latest_version#v}"
IFS='.' read -r major minor patch <<< "${version_no_prefix}"
patch=$((patch + 1))
printf '%s.%s.%s\n' "${major}" "${minor}" "${patch}"
