#!/bin/bash

set -e -x


pushd parcel-api-repo/
  ./gradlew clean build
popd

cp parcel-api-repo/build/libs/parcel-api-0.1.0.jar   build-output/.