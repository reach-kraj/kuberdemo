{{- define "kuberdemo-chart.fullname" -}}
{{- printf "%s-%s" .Release.Name .Chart.Name | trunc 63 | trimSuffix "-" -}}
{{- end }}

{{- define "kuberdemo-chart.name" -}}
{{- .Chart.Name -}}
{{- end }}

{{- define "kuberdemo-chart.labels" -}}
app.kubernetes.io/name: {{ include "kuberdemo-chart.name" . }}
helm.sh/chart: {{ .Chart.Name }}-{{ .Chart.Version | replace "+" "_" }}
app.kubernetes.io/instance: {{ .Release.Name }}
app.kubernetes.io/managed-by: {{ .Release.Service }}
{{- end }}

{{- define "kuberdemo-chart.selectorLabels" -}}
app.kubernetes.io/name: {{ include "kuberdemo-chart.name" . }}
app.kubernetes.io/instance: {{ .Release.Name }}
{{- end }}
