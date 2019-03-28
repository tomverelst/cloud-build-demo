# Cloud Build Demo

This project contains a demo application and an example `cloudbuild.yaml` file.

To run the build on Google Cloud, execute the following command:

```
$ gcloud builds submit --substitutions COMMIT_SHA=$(git rev-parse HEAD),BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD) .
```

## Running locally

Configure Docker

```
$ gcloud components install docker-credential-gcr
$ docker-credential-gcr configure-docker
```

Then install the `cloud-build-local` tool:

```
$ gcloud components install cloud-build-local
```

Run the build locally:

```
$ cloud-build-local \
  --substitutions COMMIT_SHA=$(git rev-parse HEAD),BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD) \
  --dryrun=false \
  .
```