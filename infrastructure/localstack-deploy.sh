#!/bin/bash

# Stops the script if any command fails.
set -e

# This is to clear the previous stack, add when you  need it
#aws --endpoint-url=http://localhost:4566 cloudformation delete-stack --stack-name patient-management

# Actually just this one command to deploy the cloud formations tack.
# Use the AWS CLI to deploy the cloud formation stack.
# For using LocalStack in your computer locally, you will need to add "--endpoint-url=http://localhost:4566" to use the LocalStack's endpoint,
#     otherwise it may auto use real AWS instance could cause error.
aws --endpoint-url=http://localhost:4566 cloudformation deploy \
    --stack-name patient-management \
    --template-file "./cdk.out/localstack.template.json"

# This command is not necessary, but it is good to have to print out the load balancer address that we used to access the API Gateway in the stack.
# Get the endpoint address of the Load Balancer, "elbv2" means elastic load balancer version 2.
aws --endpoint-url=http://localhost:4566 elbv2 describe-load-balancers \
    # Since we only have one load balancer here, we just use "LoadBalancers[0].DNSName".
    --query "LoadBalancers[0].DNSName" --output text
