# Infrastructure for Kumori

Currently managed by [Terraform](https://www.terraform.io/) with
[Digitalocean](https://www.digitalocean.com/) and
[Cloudflare](https://www.cloudflare.com/) as providers.

## Get started

    $ make tls_setup
    $ make t_init t_apply

`make tls_setup` will ask you to create a passphrase and supply created passphrase
a couple of times until all required files are created. Keep the passphrase
somewhere safe.

`make t_init t_apply` will download providers and ask for confirmation before
starting provisioning.

## What you get

A server `coreos` server deployed at `docker.yggoo.dk` with tls configured docker service.

## Next step

Deploy some docker containers with `docker-compose` like:

    ./compose.sh -f ./haproxy/haproxytest.yml up

## TODO

Add persistent block storage and configure docker to use it.
