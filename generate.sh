#!/bin/sh

set -e

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate -i https://docs.machines.dev/swagger/doc.json  -g java -o /local/ --type-mappings integer=long --additional-properties apiPackage=io.fly.sdk --additional-properties artifactId=fly-sdk --additional-properties groupId=io.fly --additional-properties invokerPackage=io.fly.client --additional-properties modelPackage=io.fly.client.model --additional-properties library=resttemplate --additional-properties annotationLibrary=swagger2 --additional-properties generateClientAsBean=true --additional-properties useJakartaEe=true --additional-properties hideGenerationTimestamp=true --additional-properties artifactVersion=1.1.0

sudo chown -R $(whoami):$(whoami) .