echo "**** Begin creating ecommerce kubernetes resources ****"

echo "**** Begin creating namespace production ****"
kubectl apply -f namespace-production.yaml

echo "**** Begin creating jaeger tracing ****"
kubectl apply -f https://raw.githubusercontent.com/jaegertracing/jaeger-kubernetes/master/all-in-one/jaeger-all-in-one-template.yml --namespace=com-ecommerce-production

echo "**** Begin creating persistent volume claim ****"
kubectl apply -f persistent-volume-claim-mysql.yaml

echo "**** Begin creating secret ****"
kubectl apply -f secret.yaml

echo "**** Begin creating sql initdb configmap ****"
kubectl apply -f sql-initdb-configmap.yaml

echo "**** Begin creating mysql service and deployment ****"
kubectl apply -f mysql-service-and-deployment.yaml

echo "**** Begin creating services properties configmap ****"
kubectl apply -f services-properties-configmap.yaml

echo "**** Begin creating user service and deployment ****"
kubectl apply -f user-service-and-deployment.yaml

echo "**** Begin creating order service and deployment ****"
kubectl apply -f order-service-and-deployment.yaml

echo "**** Begin creating aggregator service and deployment ****"
kubectl apply -f aggregator-service-and-deployment.yaml

echo "**** End creating ecommerce kubernetes resources"