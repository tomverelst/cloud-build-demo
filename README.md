# Cloud Build Demo

```
$ gcloud builds submit --substitution COMMIT_SHA=$(git rev-parse HEAD)
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
$ cloud-local-build \
  --substitution COMMIT_SHA=$(git rev-parse HEAD) \
  --substitution BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD)
  --dryrun=false \
  .
```